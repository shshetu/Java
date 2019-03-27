/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8Date.JavaMonthDayClass;

import java.time.LocalDate;
import java.time.MonthDay;

/**
 *
 * @author shshe
 */
public class MonthDayEx1 {
    public static void main(String[] args) {
        MonthDay month = MonthDay.now();
        LocalDate date = month.atYear(1994);
        System.out.println(date);
    }
}
