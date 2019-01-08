/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vedio_75to85;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author shshe
 */
public class Vedio79Time {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Local Time: "+ time );
            
                ///Formatted time
                DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("hh:mm:ss");
                String formatted = time.format(formatter);
                System.out.println("Formatted time: "+ formatted);
    }
   
}
