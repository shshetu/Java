/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.Concepts.CalenderClass;

import java.util.Calendar;

/**
 *
 * @author shshe
 */
public class AddMethod {
    public static void main(String[] args) {
        //create a calander
        Calendar cal = Calendar.getInstance();
        
        //print current data
        System.out.println("The current date is: "+cal.getTime());
        
        //add 20 days to the calendar
        cal.add(Calendar.DATE, 20);
        System.out.println("20 days later: "+ cal.getTime());
        
        //subtract 2 months from the calender
        cal.add(Calendar.MONTH, -20);
        System.out.println("2 Months ago: "+ cal.getTime());
        
        //subtract 5 year from the calender
        cal.add(Calendar.YEAR, -5);
        System.out.println("5 years age: "+cal.getTime());
        
      
    }
 
}
