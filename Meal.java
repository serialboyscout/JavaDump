/**
 * Class: Object Oriented Programming
 * Assignment: 
 * Application: 
 * Author: Dane Burden
 * Created: Nov 18, 2015
*/
package meal_planner;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Dane Burden
 */

public class Meal implements Serializable{
    private String name, difficulty, prepWork, cookingDir, 
                   servingDir, peopleFed, image1Path, image2Path;
    
    private double cost;
    private ArrayList<String> ingredients;
    
    public Meal(String name, String difficulty, String prepWork, 
                String cookingDir, String servingDir, String peopleFed, 
                double cost, ArrayList ingredients, String image1Path, 
                String image2Path){
        
        this.name = name;
        this.difficulty = difficulty;
        this.prepWork = prepWork;
        this.cookingDir = cookingDir;
        this.servingDir = servingDir;
        this.peopleFed = peopleFed;
        this.cost = cost;
        this.ingredients = ingredients;
        this.image1Path = image1Path;
        this.image2Path = image2Path;
    }
        
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDifficulty(){
        return this.difficulty;
    }
    public void setDifficulty(String difficulty){
        this.difficulty = difficulty;
    }   
    public String getPrepWork(){
        return this.prepWork;
    }
    public void setPrepWork(String prepWork){
        this.prepWork = prepWork;
    }  
    public String getCookingDir(){
        return this.cookingDir;
    }
    public void setCookingDir(String cookingDir){
        this.cookingDir = cookingDir;
    }
    public String getServingDir(){
        return this.servingDir;
    }
    public void setServingDir(String servingDir){
        this.servingDir = servingDir;
    }   
    public String getPeopleFed(){
        return this.peopleFed;
    }
    public void setPeopleFed(String peopleFed){
        this.peopleFed = peopleFed;
    }
    public double getCost(){
        return this.cost;
    }
    public void setCost(Double cost){
        this.cost = cost;
    }
    public void setIngredient(ArrayList ingredient){
        this.ingredients = ingredient;
    }
    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }
    public void setImage1Path(String image1Path){
        this.image1Path = image1Path;
    }
    public String getImage1Path(){
        return this.image1Path;
    }
    public void setImage2Path(String image2Path){
        this.image2Path = image2Path;
    }
    public String getImage2Path(){
        return this.image2Path;
    }
    @Override
    public String toString()
    {
        return "";
    }
}
