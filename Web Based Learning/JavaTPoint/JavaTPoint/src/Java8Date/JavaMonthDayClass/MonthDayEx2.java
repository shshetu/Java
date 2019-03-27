/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8Date.JavaMonthDayClass;

import java.time.MonthDay;

/**
 *
 * @author shshe
 */
public class MonthDayEx2 {
    public static void main(String[] args) {
        //is it valid year
        MonthDay monthDay = MonthDay.now();
        boolean b = monthDay.isValidYear(2012);
        System.out.println(b);
    }
}
