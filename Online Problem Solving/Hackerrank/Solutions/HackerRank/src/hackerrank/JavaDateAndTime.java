/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class JavaDateAndTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        
        Calendar  cal = Calendar.getInstance();
        cal.set(year, month-1,day);
        
        System.out.println(new DateFormatSymbols().getWeekdays()[cal.get(cal.DAY_OF_WEEK)].toUpperCase());
    sc.close();
    }
  
}
