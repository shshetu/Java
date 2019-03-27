/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8Date.JavaDateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
String to Date
 */
public class DateFormatEx2 {
    public static void main(String[] args) throws ParseException {
        Date d = DateFormat.getDateInstance().parse("27 Mar,2018");  
        System.out.println("Date is: "+d);  
    }
}
