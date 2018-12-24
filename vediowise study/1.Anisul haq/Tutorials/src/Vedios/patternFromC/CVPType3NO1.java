/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternFromC;
import java.util.Scanner;
/**
 *
 * @author shetu
 */
public class CVPType3NO1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of lines:");
        int n = input.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" "+col);
            }
            System.out.println("");
        }
       for (int row = n-1; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" "+col);
            }
            System.out.println("");
        }  
    }
   
}
