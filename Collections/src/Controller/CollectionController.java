package Controller;
import Model.ListModel;
import Model.TreeModel;
import Model.SetModel;
import Model.MapModel;
import View.View;
import java.util.*;

/**
 *
 * @author Caleb Cragun
 */
public class CollectionController {
    private ListModel lm;
    private MapModel mm;
    private SetModel sm;
    private TreeModel tm;
    private View view;
    
    public CollectionController(ListModel lm, MapModel mm, SetModel sm, 
            TreeModel tm, View view){
        this.lm = lm;
        this.mm = mm;
        this.sm = sm;
        this.tm = tm;
        this.view = view;
    }
    
    public List getListModel(){
        return lm.getList();
    }
    
    public void setListModel(List list){
        lm.setList(list);
    }
    
    public void addListModel(String variables[]){
        lm.addList(variables);
    }
    
    public void removeListModel(){
        lm.removeList();
    }
    
    public Map getMapModel(){
        return mm.getMap();
    }
    
    public void setMapModel(Map map){
        mm.setMap(map);
    }
    
    public void addMapModel(String variables[], String values[]){
        mm.addMap(variables, values);
    }
    
    public void removeMapModel(){
        mm.removeMap();
    }
    
    public Set getSetModel() {
        return sm.getSet();
    }

    public void setSetModel(Set set) {
        sm.setSet(set);
    }

    public void addSetModel(String variables[]) {
        sm.addSet(variables);
    }

    public void removeSetModel() {
        sm.removeSet();
    }
    
    public TreeSet getTreeModel(){
        return tm.getTree();
    }
    
    public void setTreeModel(TreeSet set){
        tm.setTree(set);
    }
    
    public void addTreeModel(String variables[]){
        tm.addTree(variables);
    }
    
    public void removeTreeModel(){
        tm.removeTree();
    }
    
    public void updateView(){
        view.showCollections(lm.getList(), mm.getMap(), sm.getSet(), 
                tm.getTree());
    }
}
