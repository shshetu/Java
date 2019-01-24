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
        int m = input.nextInt(); //month = m
        System.out.println("Enter the Day of the month: 1-31: ");
        int q = input.nextInt(); //day of the month = q
      //We have to convert Januaary and February to months 13 and 14 of the previous year
        if (m == 1|| m==2) {
            m = (m==1)?13:14;
            year--;
        }
        int k = year%100; //k = the year of the century
        int j = year/100; //century = j
        //Calculating day of the week = h
        int h = (q+(26*(m+1)/10)+k+(k/4)+(j/4)+5*j)%7;
        System.out.println("Day of the week is ");
        switch(h){
            case 0: System.out.println("Saturday");break;
            case 1: System.out.println("Sunday");break;
            case 2: System.out.println("Monday");break;
            case 3: System.out.println("Tuesday");break;
            case 4: System.out.println("Wednesday");break;
            case 5: System.out.println("Thursday");break;
            case 6: System.out.println("Friday");break;
        }
    
        
    }
}
