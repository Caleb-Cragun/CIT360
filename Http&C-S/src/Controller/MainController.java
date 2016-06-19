package Controller;

import java.util.HashMap;

/**
 *
 * @author Caleb Cragun
 */
public class MainController {

    // Hashmap for key/value pairs to use for 
    HashMap<String, Command> commands = new HashMap();

    interface Command {
        // Creates a run command that will be used for the hashmap
        void RunCommand();
    }

    public void runMethod(String command) {
        commands.get(command).RunCommand();
    }

    public void populateHashMap() {
        // Creates the various commands to be used in the hashmap
        commands.put("a", new Command() {
            public void RunCommand() {
                HTTP_Ex.urlParts();
            }
        });
        commands.put("b", new Command() {
            public void RunCommand() {
                HTTP_Ex.showHTML();
            }
        });
        commands.put("c", new Command() {
            public void RunCommand() {
                JSON_Ex.showJSON();
            }
        });

    }
}
