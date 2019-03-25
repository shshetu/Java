/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.Concepts.CalenderClass;

import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author shshe
 */
public class SetTimeZone {
    public static void main(String[] args) {
        //create calendar 
       Calendar cal = Calendar.getInstance();
       
       //print current time zone
       String name = cal.getTimeZone().getDisplayName();
        System.out.println("Current Time Zone: "+name);
        TimeZone tz = TimeZone.getTimeZone("GMT");
        //set the time zone with the given time zone value
        //and print it
        cal.setTimeZone(tz);
        System.out.println(cal.getTimeZone().getDisplayName());
    }
}
