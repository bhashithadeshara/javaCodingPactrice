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
public class Swap {
    
    public static void main(String[] args) {
        
        int no1 = 20;
        int no2 = 10;
        
        System.out.println("no1 = "+no1+" no2 ="+no2);
        
        //no1 = no1+no2;
        
        //no2 = no1 - no2;
        //no1 = no1 - no2;
        
        
        no1 = no1 * no2;
        
        no2 = no1 / no2;
        
        no1 = no1 / no2;
        
        System.out.println("no1 = "+no1+" no2 ="+no2);
    }
    
}
