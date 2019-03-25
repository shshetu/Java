/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.Concepts.CalenderClass;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author shshe
 */
public class AfterMethod {
    public static void main(String[] args) {
        //create calendar objects
        Calendar cal = Calendar.getInstance();
        Calendar future = Calendar.getInstance();
        
        //print the current date
        System.out.println("Current date: "+ cal.getTime());
        
        //change year in future calendar
        future.set(Calendar.YEAR, 2015);
        System.out.println("Year is: "+ future.get(Calendar.YEAR));
       
        //check if calendar date is after current date
        Date time = future.getTime();
        if (future.after(cal)) {
            System.out.println("Date "+time+" is after current date.");
        }
    }
 
}
