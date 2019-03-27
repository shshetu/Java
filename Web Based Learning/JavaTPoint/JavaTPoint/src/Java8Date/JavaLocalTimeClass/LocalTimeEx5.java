/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8Date.JavaLocalTimeClass;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author shshe
 */
public class LocalTimeEx5 {
    public static void main(String[] args) {
        ZoneId zone1 = ZoneId.of("Asia/Dhaka");
        ZoneId zone2 = ZoneId.of("Asia/Kolkata");
        ZoneId zone3 = ZoneId.of("Asia/Tokyo");
        //Times
        LocalTime time1 = LocalTime.now(zone1);
        LocalTime time2 = LocalTime.now(zone2);
        LocalTime time3 = LocalTime.now(zone3);
        //hours within
        long hours = ChronoUnit.HOURS.between(time1, time2);
        long hours2 = ChronoUnit.HOURS.between(time1, time3);
        long minutes = ChronoUnit.MINUTES.between(time1, time2);
        long minutes2 = ChronoUnit.MINUTES.between(time1, time3);
        //print
        System.out.println("Bangladesh Time Zone: "+time1);
        System.out.println("India Time Zone: "+time2);
        System.out.println("Japan Time Zone: "+time3);
    
         System.out.println("Hours between Bangladesh and India: "+hours);
         System.out.println("Hours between Bangladesh and Japan: "+hours2);
         System.out.println("Minutes between Bangladesh and India: "+minutes);
         System.out.println("Minutes between Bangladesh and Japan: "+minutes2);
         
    
    }
}
