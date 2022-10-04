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
public class reverse {
    
    public static void main(String[] args) {
        
       int num = 256;
       String numString = String.valueOf(num);
       String reverse="";
       
       for(int i=numString.length()-1;i>=0;i--){
       
           reverse = reverse + numString.charAt(i);
       }
       
       System.out.println(Integer.valueOf(reverse));
    }
    
}
