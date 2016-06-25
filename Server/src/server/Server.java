package server;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Caleb Cragun
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String text, temp;
        int joke;
        // Creates a socket for the server and listens for communication on port 5000
        ServerSocket s1 = new ServerSocket(5000);
        // Listens for and accepts connections from port 5000
        Socket ss = s1.accept();
        // Returns the input stream from the socket to a scanner
        Scanner sc = new Scanner(ss.getInputStream());
        // Returns an output stream from the socket to a printstream
        PrintStream p = new PrintStream(ss.getOutputStream());
        // Creates a new random to be used for a random number generator
        Random rand = new Random();
        // Executes the loop so long as there's input coming in from the client
        // if it stops, then the program terminates
        while (sc.hasNextLine()) {
            // Gets the next line of info from the client
            text = sc.nextLine(); 
            if (text.equalsIgnoreCase("t")) {
                // Generates a random number between  1 and 10
                joke = rand.nextInt(10) + 1;
                // Depending on which number it is, depends on which joke is told
                switch (joke) {
                    case 1:
                        temp = "What do you call a guy with no arms and legs in your mailbox?   Bill";
                        break;
                    case 2:
                        temp = "What do you call a guy with no arms and legs under a car?   Axel";
                        break;
                    case 3:
                        temp = "What do you call a guy with no arms and legs waterskiing?   Skip";
                        break;
                    case 4:
                        temp = "What do you call a guy with no arms and legs under a pile of leaves?   Rustle";
                        break;
                    case 5:
                        temp = "What do you call a guy with no arms and legs in a bank?   Buck";
                        break;
                    case 6:
                        temp = "What do you call a guy with no arms and legs in a hole?   Phil";
                        break;
                    case 7:
                        temp = "What do you call a gal with no arms and legs floating on a pond? Lilly";
                        break;
                    case 8:
                        temp = "What do you call a gal with no arms and legs on a tennis court?   Annette";
                        break;
                    case 9:
                        temp = "What do you call a gal with no arms and legs in a bag?   Carrie";
                        break;
                    default:
                        temp = "Humor is merely having fun at someone else's expense.";
                        break;
                }
            } else {
                // Generates a random number between 1 and 5
                joke = rand.nextInt(5) + 1;
                // Depending on the number generated depends on which custom error message is given
                switch (joke){
                    case 1:
                        temp = "Are you okay? I thought I spelled things out...";
                        break;
                    case 2:
                        temp = "Put in a menu option silly.";
                        break;
                    case 3:
                        temp = "You should go get some glasses...apparently you can't read?";
                        break;
                    case 4:
                        temp = "What is wrong with you? Can you not read?";
                        break;
                    default:
                        temp = "Plese input a valid menu option.";
                        break;         
                }
            }
            // Sends the joke or the error message back to the client
            p.println(temp);
        }
    }
}
