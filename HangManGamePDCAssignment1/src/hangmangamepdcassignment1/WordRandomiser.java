/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangmangamepdcassignment1;

import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author alist
 */

//Takes in all the words from the file and picks a random one
public class WordRandomiser extends ReadFile { 
    String randomWord;
    
// randomly picks a word from the hash set and uses that as the word for the game
    public WordRandomiser(){
        super();
        this.randomWord = picRandom();
        
    }
    
    
    public String picRandom(){
        int size = this.wordList.size();
        int item = new Random().nextInt(size);
        int i = 0;
        for(Object obj : wordList){
            if(i == item){
                return (String) obj;
            }
            i++;
        }
        return null;
    }
}
