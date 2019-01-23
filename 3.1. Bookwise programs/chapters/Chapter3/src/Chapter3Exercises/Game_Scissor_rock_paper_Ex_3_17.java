/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3Exercises;

import java.util.Scanner;

/**
Rock paper scissor-rock-paper game:
* 1.A scissor can cut a paper
* 2.A rock can knock a scissor
* 3.A paper can wrap a rock
* The program randomly generates a number 0,1,2
* The program prompts the user to enter a number 0,1 or 2
 */
public class Game_Scissor_rock_paper_Ex_3_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pcNum = (int)(Math.random()*2);
        System.out.print("Enter your guess: ");
        int guessNum = input.nextInt();
        System.out.print("The computer is:");
        switch(pcNum){
            case 0:System.out.print("Scissor");break;
            case 1:System.out.print("Rock");break;
            case 2:System.out.print("Paper");break;
        }
        System.out.print(" You are ");
        switch(guessNum){
            case 0: System.out.print("Scissor");break;
            case 1: System.out.print("Rock");break;
            case 2: System.out.print("Paper");break;
            
        }
        //Display Result
        if(pcNum == guessNum){
            System.out.print("too.It is a draw");
        }else{
        boolean win =(guessNum == 0 && pcNum == 2) || (guessNum == 1 && pcNum == 0)||(guessNum == 2 && pcNum == 1);
       if(win){System.out.print(" You WOn ");}
       else {System.out.print(". You lose");}
        }
        
    }
}
