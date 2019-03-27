/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8Date.JavaMonthDayClass;

import java.time.MonthDay;
import java.time.temporal.ChronoField;

/**
 *
 * @author shshe
 */
public class MonthDayEx3 {
    public static void main(String[] args) {
      MonthDay mon = MonthDay.now();
      long n = mon.get(ChronoField.MONTH_OF_YEAR);
        System.out.println(n);
    
    }
}
