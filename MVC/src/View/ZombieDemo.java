package View;
import Model.Zombie;
import Controller.ZombieController;
import java.util.Scanner;

/**
 *
 * @author Caleb Cragun
 */
public class ZombieDemo {
    public static void main(String[] args){
        // Variables for creating new zombie
        String name;
        String desc;
        int pow;
        
        // New input from the user
        Scanner reader = new Scanner(System.in);

        // Get a zombie from the grave
        Zombie model =  retrieveZombieFromGrave();
        
        // Create a new zombie
        ZombieView view = new ZombieView();
        
        ZombieController controller = new ZombieController(model, view);
        
        controller.updateView();
        
        // Get new input from the user
        System.out.print("Please enter a new zombie name: ");
        name = reader.nextLine();
        controller.setZombieName(name);
        System.out.print("Please enter a new zombie description: ");
        desc = reader.nextLine();
        controller.setZombieDescription(desc);
        System.out.print("Please enter a new zombie power (number): ");
        pow = reader.nextInt();
        controller.setZombiePower(pow);
        
        controller.updateView();
    }
    
    public static Zombie retrieveZombieFromGrave(){
        Zombie zombie = new Zombie();
        zombie.setName("Herric");
        zombie.setDescription("Semi-recently deceased");
        zombie.setPower(10);
        return zombie;
    }
}
