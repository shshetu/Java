/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vedio_75to85;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author shshe
 */
public class Vedio78Date {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date: "+ date);
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
       String currentDate = dateFormat.format(date);
        System.out.println("Formatted Date: "+ currentDate);
        
        
        //Attempt-1
        System.out.println("\t\tAttempt-1");
        Date date1 = new Date();
        System.out.println("Date: "+ date1);
        DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/YYYY");
        String currDate = dateFormat1.format(date1);
        System.out.println("Formatted Date: "+ currDate);
    }
}
