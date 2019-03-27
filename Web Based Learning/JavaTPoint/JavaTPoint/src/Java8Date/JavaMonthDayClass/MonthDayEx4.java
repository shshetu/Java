/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8Date.JavaMonthDayClass;

import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

/**
 *
 * @author shshe
 */
public class MonthDayEx4 {
    public static void main(String[] args) {
      MonthDay mon = MonthDay.now();
      ValueRange r1 = mon.range(ChronoField.MONTH_OF_YEAR);
        System.out.println(r1);
      ValueRange r2 = mon.range(ChronoField.DAY_OF_MONTH);
        System.out.println(r2);
        
    }
}
