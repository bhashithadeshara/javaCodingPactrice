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
public class Fibbacci {
    
    public static void main(String[] args) {
        
        int [] fib = new int[10];
        fib[0] = 0;
        fib[1] = 1;
        
        for(int i=2;i<10;i++){
        
            fib[i] =fib[i-1] + fib[i-2];
        }
        
        for(int i=0;i<10;i++){
        
            System.out.print(fib[i]+" ");
        }
        
    }
}
