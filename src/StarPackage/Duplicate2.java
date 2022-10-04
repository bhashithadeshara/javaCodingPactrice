/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StarPackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Duplicate2 {
    
    public static void main(String[] args) {
         
        String [] duplicate = {"JAVA","C","SPRING","C"};
        List duplicateList = Arrays.asList(duplicate);
        Set duplicateSet = new HashSet<>(duplicateList);
        
        if(duplicateList.size() != duplicateSet.size()){
        
            System.out.println("The array contain duplicates");
            
        }else{
           
            System.out.println("The array doesn't  contain duplicates");
            
        }
        
        
        
    }
}
