package Model;
import java.util.*;

/**
 *
 * @author Caleb Cragun
 */
public class MapModel {
    private Map map = new HashMap();
    
    public Map getMap(){
        return map;
    }
    
    public void setMap(Map map){
        this.map = map;
    }
    
    public void addMap(String variables[], String values[]){
        for(int i = 0; i < variables.length; i++){
            map.put(variables[i], values[i]);
        }
    }
    
    public void removeMap(){
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            it.next();
            it.remove();
        }
    }  
}
