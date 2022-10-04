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
public class anagram {
    
    public static void main(String[] args) {
        
       String str1 = "JAVA";
       
       String str2 = "AVAJ";
       
       char[] charStr1 = str1.toCharArray();
       char[] charStr2 = str2.toCharArray();
       
       Arrays.sort(charStr1);
       Arrays.sort(charStr2);
       
       for(int i=0;i<charStr1.length;i++){
       
           System.out.print(charStr1[i]+" ");
       }
       
       if(Arrays.equals(charStr1, charStr2)){
        
           System.out.println("true");
       }else{
           
           System.out.println("false");
       }
    }
    
}
