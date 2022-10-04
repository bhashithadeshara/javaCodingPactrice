/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StarPackage;

/**
 *
 * @author BhashithaD
 */
public class Palindrome {
    
    public static void main(String[] args) {
        
        String name = "madam";
        String reverse = "";
        
        for(int i=name.length()-1;i>=0;i--){
            reverse = reverse + name.charAt(i);
        }
        
        System.out.println(reverse);
        
        if(name.equals(reverse)){
        
            System.out.println("The word is palindrome");
        
        }else{
         
            System.out.println("The word is not palindrome");
            
        }
    }
}
