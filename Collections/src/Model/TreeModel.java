package Model;

import java.util.*;

/**
 * 
 * @author Caleb Cragun
 * @description Tree set constuctor
 */
public class TreeModel {
    private TreeSet set = new TreeSet();
    
    public TreeSet getTree(){
        return set;
    }
    
    public void setTree(TreeSet set){
        this.set = set;
    }
    
    public void addTree(String variables[]){
        for(int i = 0; i < variables.length; i++){
            set.add(variables[i]);
        }
    }
    
    public void removeTree(){
       Iterator it = set.iterator();
       while (it.hasNext()){
           it.next();
           it.remove();
       }
    }
}
