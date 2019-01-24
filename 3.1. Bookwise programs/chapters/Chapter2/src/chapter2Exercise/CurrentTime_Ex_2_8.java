/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2Exercise;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class CurrentTime_Ex_2_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Prompt user to enter the time offset of GMT
        System.out.println("Enter the time zone offset to GMT: ");
        long offset = input.nextLong();
        //Obtain the total milliseconds since midnight, Jan,1,1970
        long totalMilliSeconds = System.currentTimeMillis();
        System.out.println("total milliseconds since midnight, Jan,1,1970: "+totalMilliSeconds);
        
        //Obtain the total seconds since midnught, Jan,1,1970
        long totalSeconds = totalMilliSeconds/1000;
        System.out.println("total seconds since midnight, Jan,1,1970: "+totalSeconds);
                
        //Compute the current second in the minute in the hour
        long currentSeconds = totalSeconds%60;
        System.out.println("Current seconds : "+ currentSeconds);
        
        //Obtain the total minutes
        long totalMinutes = totalSeconds/60;
        System.out.println("Total Minutes: "+ totalMinutes);
          
        //Compute the current minute in the hour
        long currentMinute = totalMinutes %60;
        System.out.println("Current Minute: "+ currentMinute);
        
        //Obtain the total hours
        long totalHours = totalMinutes/60;
        System.out.println("Total Hours: "+ totalHours);
        
        //Compute the current hour
        long currentHour = totalHours%24;
        currentHour = currentHour+offset;
        
        //Display results
        System.out.println("Current time is: "+ currentHour+":"+currentMinute+":"+currentSeconds);
    }
}
