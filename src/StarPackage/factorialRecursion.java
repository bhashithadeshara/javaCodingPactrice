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
public class factorialRecursion {
    
    public static void main(String[] args) {
        int sum = fact(5);
        System.out.print(sum);
    }
    
    public static int fact(int num){
    
        if(num ==0 ){
          
            return 1;
        }
        
        return num * fact(num -1);
        
    }
}
