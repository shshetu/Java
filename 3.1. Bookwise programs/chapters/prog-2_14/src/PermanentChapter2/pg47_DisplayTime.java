/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PermanentChapter2;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class pg47_DisplayTime {
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
      System.out.println("Enter the seconds:");
  int seconds = input.nextInt();
  int minute = seconds/60;
  int left_seconds = seconds%60;
  System.out.println(seconds+" seconds is "+minute+" minutes and "+left_seconds+" seconds ");
  System.out.println(-5);
  System.out.println(Math.pow(2.5,-2));
     System.out.println(-34%-5);
  }  
}
