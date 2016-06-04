package Model;
import java.util.*;

/**
 *
 * @author Caleb Cragun
 */
public class ListModel {
    List list = new ArrayList();
    
    public List getList(){
        return list;
    }
    
    public void setList(List list){
        this.list = list;
    }
    
    public void addList(String variables[]){
        for(int i = 0; i < variables.length; i++){
            list.add(variables[i]);
        }
    }
    
    public void removeList(){
        for(Iterator it = list.iterator(); it.hasNext();){
            it.next();
            it.remove();
        }
    }
}
