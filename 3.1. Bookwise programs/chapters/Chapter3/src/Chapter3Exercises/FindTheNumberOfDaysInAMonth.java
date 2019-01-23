/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3Exercises;

import java.util.Scanner;

/*
Algorithm: 
1. Enter number of Days in a month by prompting
2. 

 */
public class FindTheNumberOfDaysInAMonth {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

//Prompt user to enter the month an year
System.out.println("Enter the month as integer: ");
int month = input.nextInt();
    System.out.println("Enter the year as integer: ");
    int year = input.nextInt();
    
   boolean leapYear = ((year%4 == 0 && year%100 !=0)||(year%400 == 0));
    
    //Display the number of the days in the month
    switch(month){
        case 1:System.out.println("January "+ year +" had 31 days");break;
        case 2:System.out.println(" February "+year +((leapYear)?" 28 days ":" 29 days"));break;
        case 3: System.out.println(
					 "March " + year + " had 31 days"); break;
			case 4: System.out.println(
					 "April " + year + " had 30 days"); break;
			case 5: System.out.println(
					 "May " + year + " had 31 days"); break;
			case 6: System.out.println(
					 "June " + year + " had 30 days"); break;
			case 7: System.out.println(
					 "July " + year + " had 31 days"); break;
			case 8: System.out.println(
					 "August " + year + " had 31 days"); break;
			case 9: System.out.println(
					 "September " + year + " had 30 days"); break;
			case 10: System.out.println(
					 "October " + year + " had 31 days"); break;
			case 11: System.out.println(
					 "November " + year + " had 30 days"); break;
			case 12: System.out.println(
					 "December " + year + " had 31 days");
    }
    }
}
