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
public class SecondHeighest {
    
       
    public static void main(String[] args) {
        
         int [] array = {3,4,1,5,8,6};
         int size = array.length;
         
         for(int i=0;i<size-1;i++){
         
             for(int j=0;j<size-1;j++){
                
                 if(array[j]>array[j+1]){
                   
                     int temp = array[j];
                     array[j] = array[j+1];
                     array[j+1] = temp;
                 }
             }
         }
         
         for(int i=0;i<size;i++){
         
             System.out.print(array[i]+" ");
         }
         
         
         int minIndex = size-2;
         System.out.println(" ");
         
         System.out.println("The second heighest number is "+ array[minIndex]);
    }
}
