/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8Date.JavaSimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shshe
 */
public class SimpleDateFormatEx2 {
    public static void main(String[] args) {
     SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = formatter.parse("31/03/2015");
            System.out.println("Date is: "+date);
        } catch (ParseException ex) {
            Logger.getLogger(SimpleDateFormatEx2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
