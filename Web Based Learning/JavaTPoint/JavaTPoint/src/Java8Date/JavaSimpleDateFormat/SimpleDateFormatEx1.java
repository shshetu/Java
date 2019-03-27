/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8Date.JavaSimpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author shshe
 */
public class SimpleDateFormatEx1 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter;
        formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(date);
        System.out.println(strDate);
    }
}
