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
public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year:(e.g. 2012): ");
        int year = input.nextInt();
        System.out.println("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.println("Enter the Day of the month: 1-31: ");
        int day = input.nextInt();
        System.out.println("Day of the week is: ");
        int yearOfTheCentury = year%100;
        int century = year/100;
       int h = (day+(26*(month+1))/10+yearOfTheCentury+
               (yearOfTheCentury)/4+(century/4))%7;
        
    }
}
