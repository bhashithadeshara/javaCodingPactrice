/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floydsTraingle;

/**
 *
 * @author BhashithaD
 */
public class FloydClass {
    
    public static void main(String[] args) {
        
        int n =1;
        for(int i=1;i<=4;i++){
        
            for(int j=0;j<i;j++){
            
                System.out.print(n+" ");
                n++;
            }
            System.out.println("");
        }
        
    }
}
