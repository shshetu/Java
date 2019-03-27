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
public class LocalDateExample1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = yesterday.plusDays(2);
        System.out.println("Today date: " + date);
        System.out.println("yesterday date: " + yesterday);
        System.out.println("tomorrow date: " + tomorrow);

    }
}
