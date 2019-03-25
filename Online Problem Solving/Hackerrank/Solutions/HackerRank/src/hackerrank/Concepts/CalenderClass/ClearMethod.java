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
public class ClearMethod {
    public static void main(String[] args) {
        //create calendar instance
        Calendar  cal = Calendar.getInstance();
        
        //displays the current date and time
        System.out.println("Current Calendar Date: "+ cal.getTime());
        
        //use clear method to set all field values and time value as undefined
        cal.clear();
        
        //print the result
        System.out.println("The calendar shows : "+ cal.getTime());

    }
}
