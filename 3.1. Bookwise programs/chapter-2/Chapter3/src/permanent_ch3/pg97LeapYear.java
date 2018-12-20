/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permanent_ch3;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class pg97LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = input.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("Leap year!");
        }else{System.out.println("Not a leap year!");}
    }
 
}
