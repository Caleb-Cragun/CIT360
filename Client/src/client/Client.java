package client;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Caleb Cragun
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String text, temp;
        // Creates a new scanner to get input from the user
        Scanner sc = new Scanner(System.in);
        // Creates a new socket for the client that connects to port 5000 and 
        // at the ip address 127.0.0.1
        Socket s = new Socket("127.0.0.1", 5000);
        // Returns the input stream from the socket to a scanner
        Scanner sc1 = new Scanner(s.getInputStream());
        // Returns an output stream from the socket to a printstream
        PrintStream p = new PrintStream(s.getOutputStream());
        // Prints out a starting message for the client
        System.out.println("Type [T] for the server to tell you a joke or [Q] to quit:");
        // Sets the input from the user to the value text
        text = sc.nextLine();
        // Checks to make sure the value assigned to text isn't Q
        while (!text.equalsIgnoreCase("q")) {
            // Sends the value of text to the server
            p.println(text);
            // Gets the message from the sever
            temp = sc1.nextLine();
            // Prints the message from the server
            System.out.println(temp);
            // Gets the next input from the user
            text = sc.nextLine();
        }
       
    }

}
