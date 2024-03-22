/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hangmangamepdcassignment1;

import java.util.Scanner;

/**
 *
 * @author Alister
 */
public class HangManGamePDCAssignment1 {

    /**
     * @param args the command line arguments
     */
    
    
    //this file will be used as the main runner to run the code
    public static void main(String[] args) {
        FileWriter fw = new FileWriter();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("import text you want to add to the file:");
        String text = scan.nextLine();
        fw.write(text);
    }
    
}
