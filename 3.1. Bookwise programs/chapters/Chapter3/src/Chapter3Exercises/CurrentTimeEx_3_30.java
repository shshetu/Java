/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3Exercises;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class CurrentTimeEx_3_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT: ");
        long offSet = input.nextLong();
        
        //Total times
        long milliSeconds = System.currentTimeMillis();
        long totalSeconds = milliSeconds/1000;
        long totalMinutes = totalSeconds/60;
        long totalHours = totalMinutes/60;
        
        //Current times
        long currentSeconds = totalSeconds%60;
        long currentMinutes = totalMinutes%60;
        long currentHours = totalHours%24;
        System.out.println("Current hours: "+ currentHours);
        //converted time
        long convertedHours = currentHours + offSet;
        System.out.println("Current time is: "+(convertedHours>12 ? convertedHours-12:convertedHours)+":"+currentMinutes+":"+currentSeconds+(convertedHours>12?" PM":" AM"));
        
    }
}
  

