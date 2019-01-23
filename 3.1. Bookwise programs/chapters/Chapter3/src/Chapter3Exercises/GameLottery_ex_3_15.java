/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3Exercises;

import java.util.Scanner;

/*
Algorithm: 
1. Generate the three digit number
2. Take 3 digit number input from user
3. calculate the rules 
4. print the result
 */
public class GameLottery_ex_3_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 3 digit number: ");
        int inputNum = input.nextInt();
        int num = (int)(Math.random()*1000);
        System.out.println("Random number: "+ num);
        System.out.println("Inputted number: "+ inputNum);
        //User inputted digits
        System.out.println("User inputed digits: ");
      
        int numd1 = inputNum/100;
          System.out.println("User: first digit = "+ numd1);
        int nextDigits = inputNum%100;
     
        int numd2 = nextDigits/10;
             System.out.println("User: Second digit = "+ numd2);
        int numd3 = nextDigits%10;
             System.out.println("User: Second digit = "+ numd3);
             
             //Random generated digits
        System.out.println("Random generated digits: ");
      
        int rnumd1 = num/100;
          System.out.println("Random: first digit = "+ rnumd1);
        int rNextDigits = num%100;
     
        int rnumd2 = rNextDigits/10;
             System.out.println("Random: Second digit = "+ rnumd2);
        int rnumd3 = rNextDigits%10;
             System.out.println("Random: Third digit = "+ rnumd3);
        
        
        
    }
}
