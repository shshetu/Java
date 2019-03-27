/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8Date.JavaLocalDateClass;

import java.time.LocalDate;

/**
 *
 * @author shshe
 */
public class LocalDateEx2 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2017, 1, 13);
        System.out.println(date1.isLeapYear());
        LocalDate date2 = LocalDate.of(2016, 9, 23);
        System.out.println(date2.isLeapYear());
    }
 
}
