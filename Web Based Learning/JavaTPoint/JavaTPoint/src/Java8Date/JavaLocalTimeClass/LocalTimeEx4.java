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
public class LocalTimeEx4 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(10,43,12);
        LocalTime time1 = time.plusHours(4);
        LocalTime time2 = time1.plusMinutes(18);
        System.out.println(time2);
        
    }
}
