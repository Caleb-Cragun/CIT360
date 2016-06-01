package Model;

/**
 *
 * @author Caleb Cragun
 * @description class that helps in the creation of a zombie
 */
public class Zombie{
    private String name;
    private String description;
    private int power;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public int getPower(){
        return power;
    }
    
    public void setPower(int power){
        this.power = power;
    }
}