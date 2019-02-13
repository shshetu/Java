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
public class Q3_Java_Output_Formatting {
    public static void main(String[] args) {
        int count =0;
    Scanner input = new Scanner(System.in);
    String[] s = new String[3];
    int[] x = new int[3];
    int[] n = new int[10];
      int[] n1 = new int[10];
        for (int i = 0; i < 3; i++) {
          
           s[i] = input.next();
           x[i] = input.nextInt();    
            }
        
        for (int i = 0; i < 3; i++) {
            
            n[i] = s[i].length();
            n1[i] = (int)(Integer.toString(x[i]).length());
            
        }
        
 //output
        System.out.println("============================");
        for (int i = 0; i < 3; i++) {
            System.out.print(s[i]);
            for (int j = 0; j < 15-n[i]; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 3-n1[i]; j++) {
                System.out.print("0");
            }
            
            System.out.print(x[i]);
            System.out.print("\n");
        }
        System.out.println("=============================");
       
          
    }
}
