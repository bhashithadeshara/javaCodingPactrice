/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StarPackage;

import java.util.Arrays;

/**
 *
 * @author BhashithaD
 */
public class RemoveDuplicateString {   
    
    
    public static void main(String[] args) {
           
       String name = "jaVA";
    
       name = name.toUpperCase();
       
       System.out.println(name);
       
       char [] cha = name.toCharArray();
       
       Arrays.sort(cha);
       
       for(int i=0;i<cha.length;i++){
       
           System.out.print(cha[i]);
       }
       
       System.out.println("");
       
       int j=0;
       int size = cha.length;
       
       char [] temp = new char[size];
       
       for(int i=0;i<size-1;i++){
       
           if(cha[i] != cha[i+1]){
           
               temp[j++] = cha[i];
           }
       }
       
       temp[j++] = cha[size-1];
       
       System.out.println("After remove duplicate");
       
       for(int i=0;i<j;i++){
       
           System.out.print(temp[i]+" ");
       }
       
    }
    
   
    
    
}
