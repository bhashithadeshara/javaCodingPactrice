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
public class FactorDemo {
    
    public static void main(String[] args) {
        
         for(int i=1;i<=100;i++){
           System.out.print("The factorial of "+i+" are ");
           
             for(int j=1;j<=i;j++){             
                
                 if(i % j == 0){
                 
                     System.out.print(j+" ");
                 }
             }
             System.out.println(" ");
         }
    }
}
