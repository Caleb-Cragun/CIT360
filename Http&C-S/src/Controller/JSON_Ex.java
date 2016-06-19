package Controller;
import java.util.Scanner;
import org.json.simple.*;
/**
 *
 * @author Caleb Cragun
 */
public class JSON_Ex {
    static void showJSON(){
        // Gets some info from the user
        Scanner overWatch = new Scanner(System.in);
        System.out.println("JSON EXAMPLE");
        System.out.println("Please input your name: ");
        String name = overWatch.nextLine();
        System.out.println("Please input your respective country: ");
        String country = overWatch.nextLine();
        System.out.println("Please input your ID Number: ");
        String id = overWatch.nextLine();
        System.out.println("Please input your power: ");
        String power = overWatch.nextLine();
        System.out.println("Processing...");
        
        // Creates a JSON object
        JSONObject character = new JSONObject();
        
        // Adds the features to the JSON object
        character.put("name", name);
        character.put("country", country);
        character.put("id", id);
        character.put("power", power);
        
        // Tests the object to see if was created properly
        System.out.println("Thank you for registering");
        System.out.println(character);
        System.out.println("Hero information:");
        System.out.println(character.get("name") + " " + 
                           character.get("country") + " " + 
                           character.get("id") + " " + 
                           character.get("power"));
        System.out.println();
    }
    
}
