package View;
import java.util.*;

/**
 *
 * @author Caleb Cragun
 */
public class View {
    public void showCollections(List list, Map map, Set set, TreeSet tree){
        System.out.println("LIST");
        System.out.println("Items in list: " + list);
        System.out.println();
        System.out.println("MAP");
        System.out.println("Items in map: " + map);
        System.out.println();
        System.out.println("SET");
        System.out.println("Items in set: " + set);
        System.out.println();
        System.out.println("TREE");
        System.out.println("Items in tree set: " + tree);
        System.out.println();
    }
}
