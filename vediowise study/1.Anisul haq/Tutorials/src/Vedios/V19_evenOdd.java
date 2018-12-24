/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vedios;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class V19_evenOdd {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    /*if(number%2==0){System.out.println("Even");}else{System.out.println("Odd");}
*/
   switch(number%2){
       case 0: System.out.println("positive");break;
       case 1: System.out.println("Negative");break;
   default: System.out.println("Error");
}
    }
}
