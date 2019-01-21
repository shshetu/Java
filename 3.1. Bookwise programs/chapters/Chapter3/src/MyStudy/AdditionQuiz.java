/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyStudy;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class AdditionQuiz {
//Page-77    
    public static void main(String[] args) {
        //Systme.currentTimeMillis() will result in current time in milliseconds
        double number = System.currentTimeMillis();
        System.out.println(number);
        
        //It will print a huge number and if we divide it by 10 there will be a remainder
        int number1 = (int)(System.currentTimeMillis()%10);
        System.out.println("Number1: "+ number1);
        int number2 = (int)(System.currentTimeMillis()/7%10);
        System.out.println("Number2: "+ number2);
        
        //Create a Scanner
        //**Inside Scanner object class there should be System.in
        Scanner input = new Scanner(System.in); 
        System.out.println("What is: "+ number1 + " + "+ number2+ "?");
        int answer = input.nextInt();
    
        System.out.println(number1 + " + "+ number2+" = "+ answer+ " is "
        + (number1+ number2 == answer));
    
    
    
    }
}
