/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8Date.JavaDateFormat;

import java.text.DateFormat;
import java.util.Date;

/**
//Date to String
 */
public class DateFormatEx1 {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("Current Date: "+ currentDate);
        String dateToStr = DateFormat.getInstance().format(currentDate);
        System.out.println("Date Format using getInstance(): "+dateToStr);
    }
}
