/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangmangamepdcassignment1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

/**
 *
 * @author alist
 */

//Reads all the words on the file 
public class ReadFile {
    
    public HashSet<String> read(){ 
    //I think somthing like A hash set could work because every element has to be unique to be unique
    //add to each item of the has set by reading from the file
        
        HashSet<String> wordsList = new HashSet<String>(); //used to make sure all Strings are unique
        try{
            FileReader fr = new FileReader("./resources/word_bank.txt");
            BufferedReader inputStream = new BufferedReader(fr);
            String line = null;
            while((line=inputStream.readLine())!= null){ //loops through all the words in the file
                wordsList.add(line); //adds words to the set
            }
            inputStream.close();
            }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
        catch(IOException e) {
            System.out.println("Error reading from file " );
        }
        return wordsList;
    }
    
}
