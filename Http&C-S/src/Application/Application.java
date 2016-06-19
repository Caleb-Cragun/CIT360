package Application;
import Controller.MainController;
import java.util.Scanner;
/**
 *
 * @author Caleb Cragun
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // Creates a new controller for the file
        MainController overlord = new MainController();
        
        // Stuff to get user input
        Scanner user = new Scanner(System.in);
        String prompt;
        
        // Creates the hashmap for the overloard controller to use
        overlord.populateHashMap();
        System.out.println("Welcome. What would you like to see?");
        do{
            System.out.println("Menu");
            System.out.println("[A] Parts of a URL");
            System.out.println("[B] HTML from a URL");
            System.out.println("[C] JSON example");
            System.out.println("[Q] Quit");
            prompt = user.nextLine();
            switch(prompt.toLowerCase()){
                case "a":
                case "b":
                case "c":
                    overlord.runMethod(prompt);
                    break;
                case "q":
                    System.out.println("Thank you for using this program.");
                    break;
                default: 
                    System.out.println("Invalid input. Please try again!");
                    System.out.println();
                    break;
            }
        } while (!prompt.equalsIgnoreCase("q"));
        
    }    
}
