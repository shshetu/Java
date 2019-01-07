/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date27_12_2018_Chapter6;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Pg228PrintCalender {
 
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
        //Prompt the user to enter year
        System.out.println("Enter the year");
       int year = input.nextInt();
        
        //Prompt the user to enter month
        System.out.println("Enter the month");
       int month = input.nextInt();
       //Print Calender for the month of the year
    printMonth(year,month);    
    }
    
    public static void printMonth(int year, int month){
     ///Print the headings of the calender
        printMonthTitle(year,month);
        
        //Print the body of the calender
        printMonthBody(year,month);
    }
    //Print the month title eg March 2012
    public static void printMonthTitle(int year,int month) {
        System.out.println("    "+ getMonthName(month) + "" + year);
        System.out.println("--------------------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }
    //Get teh English Name for the month
    public static String getMonthName(int month) {
        String monthName = "";
        switch(month){
        case 1: monthName = "January";break;
        case 2: monthName = "February";break;
        case 3: monthName = "March";break;
        case 4: monthName = "April";break;
        case 5: monthName = "May";break;
        case 6: monthName = "Jun";break;
        case 7: monthName = "July";break;
        case 8: monthName = "August";break;
        case 9: monthName = "September";break;
        case 10: monthName = "October";break;
        case 11: monthName = "November";break;
        case 12: monthName = "December";break;
    }
        return monthName;
    }
    
    public static void printMonthBody(int year,int month) {
        //Get start day of the week for the first date in the month
        int StartDay = getStartDay(year,month);
        
        //Get number of days in the month
        int numberOfDayInMonth = getNumberOfDaysInMonth(year,month);
        
    }
    
    public static int getStartDay(int year, int month){
    return 1;
    }
    public static int getTotalNumberOfDays(int year, int month){
    return 10000;
    }
    public static int getNumberOfDaysInMonth(int year, int month){
    return 31;
    }
    public static boolean isLeapYear(int year, int month){
    return true;
    }
    }
    
    
    

