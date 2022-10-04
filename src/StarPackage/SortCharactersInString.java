/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StarPackage;

import java.util.Arrays;

/**
 *
 * @author BhashithaD
 */
public class SortCharactersInString {
    
    public static void main(String[] args) {
        
        String name = "BHASHITHA";
        
        System.out.println(name);
        
        char [] charName = name.toCharArray();
        
        Arrays.sort(charName);
        
        
        
        System.out.println("");
        
        for(int i=0;i<charName.length;i++){
       
           System.out.print(charName[i]+" ");
       }
    }
}
