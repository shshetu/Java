/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_16_01_19;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SentinalValueTest {
    public static void main(String[] args) {
       
        double sum = 0;
double num1 , num2;
        Scanner input = new Scanner(System.in);
        double i=1;
        double j=1;
    while(i != -1 && j != -1){
        
        System.out.println("Enter 2 numbers:");
         num1  = input.nextInt();
        num2  = input.nextInt();
         i = num1;
            j = num2;
      if(i!= -1 && j!= -1){
        sum += num1+num2;
        System.out.println("Sum: "+ sum);
       }else{System.out.println("Total Sum: "+ sum);break;}
      
    }
       
       }
}
