/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StarPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author BhashithaD
 */
public class DuplicateNum {
    
    public static void main(String[] args) {
        
       int [] array = {10,70,30,90,20,20,30,40,70,50};
       int size = array.length;
       
       Arrays.sort(array);
       
       for(int i=0;i<size;i++){
       
           System.out.print(array[i]+" ");
       }
       
       int [] temp = new int[size];
       int j=0;
       
       for(int i=0;i<size-1;i++){
       
           if(array[i] !=array[i+1]){
           
               temp[j++] = array[i];
           }
       }
       
       temp[j++] = array[size-1];
       
      
       
       System.out.println(" ");
       
        for(int i=0;i<j;i++){
       
           System.out.print(temp[i]+" ");
       }
        
        
    }
}
