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
public class DateTimeEx1 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before Formatting: "+now);
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = now.format(format);
        System.out.println("After Fomatting: "+ formatDateTime);
    }
}
