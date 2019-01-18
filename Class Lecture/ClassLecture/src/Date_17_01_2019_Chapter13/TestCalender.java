/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_17_01_2019_Chapter13;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author User
 */
public class TestCalender {
    //Constructor a Gregorian calender for the current date and time
    public static void main(String[] args) {
       
            Calendar calendar = new GregorianCalendar();
            System.out.println("Current time is: "+ new Date()); //invoking date object from the java.util.Date() method
            System.out.println("YEAR: "+ calendar.get(Calendar.YEAR));
            System.out.println("DATE: "+ calendar.get(Calendar.DATE));
            System.out.println("HOUR: "+ calendar.get(Calendar.HOUR));
            System.out.println("HOUR_OF_DAY: "+ calendar.get(Calendar.HOUR_OF_DAY));
            System.out.println("MINUTE: "+ calendar.get(Calendar.MINUTE));
            System.out.println("SECOND: "+ calendar.get(Calendar.SECOND));
            System.out.println("DAY_OF_Week: "+ calendar.get(Calendar.DAY_OF_WEEK));
       
            
            ///Unfinished.......................
    }
}
