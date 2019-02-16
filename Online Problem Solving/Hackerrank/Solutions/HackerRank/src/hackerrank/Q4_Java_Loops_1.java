/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class Q4_Java_Loops_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
       
           if(n>=2 && n<=20){
             
                    for (int i = 1; i <= 10; i++) {
            System.out.println(n+" x "+i+ " = "+ n*i);
        }
                   
                
        
        } else{
               try {
                   throw new Exception();
               } catch (Exception e) {
                   System.out.println(e);
               }
           }
       
        
    }
}
