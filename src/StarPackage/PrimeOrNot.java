/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StarPackage;


public class PrimeOrNot {
    
    public static void main(String[] args) {
         
        int num = 29;
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag){
      System.out.println(num + " is a prime number.");
    }else
      System.out.println(num + " is not a prime number.");
     }

}

