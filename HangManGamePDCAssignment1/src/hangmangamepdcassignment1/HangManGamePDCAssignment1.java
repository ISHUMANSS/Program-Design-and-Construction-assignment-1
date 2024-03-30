/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hangmangamepdcassignment1;

import java.util.NoSuchElementException;
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
        boolean game = true;
        
        while(game){
            System.out.println("Game has started!");
            System.out.println("what would you like to do?");
            System.out.println("Add a word to the file (a)");
            System.out.println("Pick a random word (r)");
            System.out.println("Quit (x)");
            try{
                String answer = scan.nextLine();
                if(answer.equalsIgnoreCase("x")){
                    
                    game = false;
                }
                else if(answer.equalsIgnoreCase("a")){
                    System.out.println("import text you want to add to the file:");
                    String text = scan.nextLine();
                    fw.write(text);
                }
                else if(answer.equalsIgnoreCase("r")){
                    WordRandomiser wr = new WordRandomiser();
                    System.out.println("Your random word is: " + wr.randomWord);
                }
                else{
                    System.out.println("That wasn't one of the options please input again!");
                }
                
                
            }
            catch(NoSuchElementException E){
                System.out.println("No such element exception please try again");
            }
            
        }
        scan.close();
        
    }
    
}
