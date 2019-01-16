/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporary;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class WhileLoopTesting {
    public static void main(String[] args) {
        int i = 1;
        int num1 = 0 , num2 = 0;
  
        while(true){
    Scanner input = new Scanner(System.in);
        System.out.print(" Enter num1: ");
        num1 = input.nextInt();
  
        System.out.print(" Enter num2: ");
        num2 = input.nextInt();
  if(num1 == -1 || num2 == -1){System.out.println("Termination Value reached");break;}else{
        int result = num1 + num2;
        System.out.println("Result: "+ result);
        }
  }
        }
    
   
}
