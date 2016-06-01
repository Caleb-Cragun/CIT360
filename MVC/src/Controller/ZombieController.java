package Controller;
import Model.Zombie;
import View.ZombieView;

/**
 *
 * @author Caleb Cragun
 */
public class ZombieController {
    private Zombie model;
    private ZombieView view;
    
    public ZombieController(Zombie model, ZombieView view){
        this.model = model;
        this.view = view;
    }
    
    public void setZombieName(String name){
        model.setName(name);
    }
    
    public String getzombieName(){
        return model.getName();
    }
    
    public void setZombieDescription(String description){
        model.setDescription(description);
    }
    
    public String getZombieDescription(){
        return model.getDescription();
    }
    
    public void setZombiePower(int power){
        model.setPower(power);
    }
    
    public int getZombiePower(){
        return model.getPower();
    }
    
    public void updateView(){
        view.describeZombie(model.getName(), model.getDescription(), model.getPower());
    }
}
