/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternType7;
import java.util.Scanner;
/**
 *
 * @author shetu
 */
public class Pat1 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("How many lines you want to print:");
         int n = input.nextInt();
         for (int row = 1; row <= n; row++) {
             for (int col = 1; col <= n; col++) {
                 System.out.print("*");
             }
             System.out.println("");
        }
         
    }
   

}
