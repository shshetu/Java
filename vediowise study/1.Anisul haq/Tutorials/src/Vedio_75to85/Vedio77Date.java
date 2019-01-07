/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vedio_75to85;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author shshe
 */
public class Vedio77Date {
    public static void main(String[] args) {
        //Inputing date using Date
        Date date = new Date();
        System.out.println("Current Date: "+ date);
        
        //Formatting Date using DateFormat and SimpleDateFormat
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/YYYY");
        String currentDate = dateFormat.format(date);
        System.out.println("Formatting date: "+ currentDate);
        
        
        
        
        //======================================================
        //attempt-1
        System.out.println("\t\tAttempt-1");
        Date date1 = new Date();
        System.out.println("Current Date: "+ date1);
        DateFormat dateFormat1 = new SimpleDateFormat("dd-mm-yyyy");
        String currentDate1 = dateFormat1.format(date1);
        System.out.println("Current Formatted date: "+ currentDate1);
    }
}
