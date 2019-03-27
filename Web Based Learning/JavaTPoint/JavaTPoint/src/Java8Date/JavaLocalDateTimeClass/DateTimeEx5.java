/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8Date.JavaLocalDateTimeClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author shshe
 */
public class DateTimeEx5 {
    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.of(2017, 1, 14, 10, 34);
        LocalDateTime dateTime2 = dateTime1.plusDays(30);
        System.out.println("Before formatting: "+dateTime2);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDateTime = dateTime2.format(format);
        System.out.println("After formatting: "+formattedDateTime);
    }
  
}
