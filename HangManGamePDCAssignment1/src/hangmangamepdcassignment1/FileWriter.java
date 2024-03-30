/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangmangamepdcassignment1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author alist
 */

//allows the user to write to the file
public class FileWriter {
    PrintWriter pw = null;
    
    public void write(String input){
        try{
            
            pw = new PrintWriter(new FileOutputStream("./resources/word_bank.txt",true)); //appends the rather then replaces the text
            pw.println(input); //will print the inputed text to the file
            pw.close();
            
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    //using the hash set in the file reader file makes it so that words are allowed to be added to the set multiple times without it messing with how many times it turns up
    
    
}
