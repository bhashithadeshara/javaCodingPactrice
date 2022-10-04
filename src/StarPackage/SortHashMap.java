/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StarPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author BhashithaD
 */
public class SortHashMap {
    
    public static void main(String[] args) {
         
        Map<String,String> unsortedMap = new HashMap<>();
        unsortedMap.put("apple", "apple");
        unsortedMap.put("pineapple", "pineapple");
        unsortedMap.put("banana", "banana");
        unsortedMap.put("guava", "guava");
        
        for(Map.Entry<String,String> entry:unsortedMap.entrySet()){
        
            System.out.print("key value = "+entry.getKey());            
            
        }
        System.out.println();
        
        Map<String,String> treeMap = new TreeMap<String,String>(unsortedMap);
        
        for(Map.Entry<String,String> entry:treeMap.entrySet()){
        
            System.out.print("key value = "+entry.getKey());            
            
        }
        
    }
}
