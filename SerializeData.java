/**
 * Class: Object Oriented Programming
 * Assignment: 
 * Application: 
 * Author: Dane Burden
 * Created: Nov 28, 2015
*/
package meal_planner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Dane Burden
 */
public class SerializeData {
    
    public void serializeData(ArrayList<Meal> inputList){
    	String filePath = null;
    	
        //Daniel code
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));
        
        if(!inputList.isEmpty()){
            int result = fileChooser.showSaveDialog(fileChooser);

            if (result == JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser.getSelectedFile();
                filePath =  selectedFile.getAbsolutePath();
                
                if(!filePath.toLowerCase().endsWith(".ser")){
                    filePath = filePath + ".ser";
                }

                try(FileOutputStream outStream = new FileOutputStream(filePath)){
                    ObjectOutputStream serializeData = new ObjectOutputStream(outStream);
                    serializeData.writeObject(inputList);            
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No items to save.", "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public ArrayList deserializeData(){
        String filePath = null;
        ArrayList<Meal> savedList = null;
        
        //Daniel Code
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Java Serialization File", "ser");
        fileChooser.setFileFilter(filter);
        fileChooser.setCurrentDirectory(new File("."));
        
        int result = fileChooser.showOpenDialog(fileChooser);

        if (result == JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            filePath =  selectedFile.getAbsolutePath();

            try(FileInputStream inStream = new FileInputStream(filePath)){
                ObjectInputStream deserializeData = new ObjectInputStream(inStream);
                savedList = (ArrayList<Meal>)deserializeData.readObject();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return savedList;
    }
}
