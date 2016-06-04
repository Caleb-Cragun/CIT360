package View;
import Model.*;
import View.View;
import Controller.CollectionController;

/**
 *
 * @author Caleb Cragun
 */
public class Collections {
    public static void main(String[] args){
        // Arrays for the different collections
        // Array for list collection
        String aliens[] = {"Venusan", "Earthling", "Martian", "Neptunian", "Plutonian"};
        // Arrays for map collection
        String islands[] = {"Puerto Rico", "Antigua", "Jamaica", "Haiti"};
        String amounts[] = {"10000", "500", "75", "846"};
        // Array for set collection
        String cars[] = {"Bugatti", "Corvette", "McLaren", "Lotus", "Ferrari"};
        // Array for tree collection
        String ninjas[] = {"Naruto", "Kakashi", "Saske", "Geriah", "Rock Lee"};
        // Creates new view for the controller
        View view = new View();
        // Creates new models for the controller
        ListModel lm = new ListModel();
        MapModel mm = new MapModel();
        SetModel sm = new SetModel();
        TreeModel tm = new TreeModel();
        // Creates the controller
        CollectionController cc = new CollectionController(lm,mm,sm,tm,view);
        
        // Adds the lists to the new models
        cc.addListModel(aliens);
        cc.addMapModel(islands, amounts);
        cc.addSetModel(cars);
        cc.addTreeModel(ninjas);
        
        // Updates the view
        System.out.println("Original sets:");
        cc.updateView();
        
        // Removes each of the sets
        cc.removeListModel();
        cc.removeMapModel();
        cc.removeSetModel();
        cc.removeTreeModel();
        
        // Updates the view after removal
        System.out.println("Sets after removal: ");
        cc.updateView();
    }
}
