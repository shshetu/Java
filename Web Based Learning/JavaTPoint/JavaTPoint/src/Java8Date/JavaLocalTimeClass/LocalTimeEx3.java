/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8Date.JavaLocalTimeClass;

import java.time.LocalTime;

/**
 *
 * @author shshe
 */
public class LocalTimeEx3 {

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);
        //custom time
        LocalTime time1 = LocalTime.of(10,43,12);
        System.out.println("Custom Time: "+time1);
        
        //minus hours
        LocalTime time2 = time1.minusHours(2);
        LocalTime time3 = time2.minusMinutes(34);
        System.out.println(time3);
        //minus minute
    }
}
