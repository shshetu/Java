/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vedio_75to85;

import java.util.Random;

/**
 *
 * @author shshe
 */
public class Vedio80RandomNumberGenerator {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10); //0 to 9
        System.out.println("Random number within range(0-9): " + randomNumber);
        
        //Starting from 1 
        int randomNumber1 = rand.nextInt(10)+1;
        System.out.println("Random Number within range(1-9): "+ randomNumber1);
        
//Generating Random number using Math.random()                           
int randomNum = (int)(Math.random()*10) ;
        System.out.println("Random Number using Math.random(): "+ randomNum);
//Strating from 1
int randomNum1 = (int)(Math.random()*10 + 1) ;
        System.out.println("Random Number range(1-10): "+ randomNum1);
////Attempt-1 
        System.out.println("\t\tAttempt-1");
                    
    //Random Number within range:(4-65)
    Random rand2 = new Random();
    int randomNumber2 = rand2.nextInt(66) + 4;
        System.out.println("Random Number within range(4-65): "+ randomNumber2);
    }
}
