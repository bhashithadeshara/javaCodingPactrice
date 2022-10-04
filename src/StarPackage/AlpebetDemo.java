/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StarPackage;

import java.util.Scanner;

/**
 *
 * @author BhashithaD
 */
public class AlpebetDemo {
    
    public static void main(String[] args) {
        
       Scanner scan1 = new Scanner(System.in);
       
       System.out.println("Enter char");
       char ch = scan1.next().charAt(0);       
       
        
        if(ch>='a' && ch<='z' || ch>='A' && ch <='Z'){
          System.out.println("alphebate");
        }else{
          System.out.println("not");
        }
        
        for(char cha='a';cha<='z';cha++){
        
            System.out.print(cha +" ");
        }
    }
        
            
}
