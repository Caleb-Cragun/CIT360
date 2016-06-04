package Model;

import java.util.*;

/**
 *
 * @author Caleb Cragun
 */
public class SetModel {

    private Set set = new HashSet();

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public void addSet(String variables[]) {
        for (int i = 0; i < variables.length; i++) {
            set.add(variables[i]);
        }
    }

    public void removeSet() {
        Iterator it = set.iterator();
        while(it.hasNext()){
            it.next();
            it.remove();
        }
    }
}
