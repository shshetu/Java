/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8Date.JavaLocalDateClass;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author shshe
 */
public class LocalDateEx3 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDateTime datetime = date.atTime(1,50,9);
        System.out.println(datetime);
    }
}
