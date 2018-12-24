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
public class V23_digit_checking {
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   int digit = input.nextInt();
   //if(digit>=0&&digit<=9){System.out.println("It is a digit!");}else{System.out.println("Not a digit!");}
   switch(digit)
   {
       case 0:System.out.println("Zero!");break;
       case 1:System.out.println("One!");break;
   case 2:System.out.println("Two!");break;
   case 3:System.out.println("Three!");break;
   case 4:System.out.println("Four!");break;
   case 5:System.out.println("Five!");break;
   case 6:System.out.println("Six!");break;
   case 7:System.out.println("Seven!");break;
   case 8:System.out.println("Eight!");break;
   case 9:System.out.println("Nine!");break;
   default:System.out.println("Not a number!");
   }
   } 
}
