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
public class GetTimeZone {
    public static void main(String[] args) {
        ///create a calendar
        Calendar cal = Calendar.getInstance();
        
        ///get the time zone
        TimeZone tz = cal.getTimeZone();
        
        //print the time zone name for this calendar
        System.out.println("1The time zone is: "+ tz.getDisplayName());
    }
}
