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
public class MissingNum {
    
    public static void main(String[] args) {
        
        int [] array = {1,2,3,5};
        
        int aSize = array.length+1;
        
        int n = aSize;
                
        int exTotal = n * (n+1)/2;
        
        int aTotal = 0;
        
        System.out.println(exTotal);
        
        for(int i =0;i<array.length;i++){
        
            aTotal = aTotal + array[i];
        }
        
        int mNum = exTotal - aTotal;                
        
        System.out.println(mNum);
    }
}
