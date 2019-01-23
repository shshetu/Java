/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3Exercises;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class HeadsOrTail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Enter your guess: either head or tail");
       String guess = input.next();
        int result = (int)(Math.random()*2);
        System.out.println("Result: "+ result);
        String s = (result==0)?"head":"tail";
        System.out.println("Actual shuffle: " + s);
        if(s == guess.toLowerCase()){System.out.println("Correct Guess!");}
        else {System.out.println("Incorrect Guess!");}
    }
}
