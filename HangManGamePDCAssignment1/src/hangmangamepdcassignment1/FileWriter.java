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
            
            //Will want it to check that every word is unique first
            pw = new PrintWriter(new FileOutputStream("./resources/word_bank.txt",true)); //appends the rather then replaces the text
            pw.println(input); //will print the inputed text to the file
            pw.close();
            
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    
    
}
