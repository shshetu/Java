/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8Date.JavaSQLDate;

import java.sql.Date;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author shshe
 */
public class SQLDateEx2 {

    public static void main(String[] args) {
        String str = "2015-03-31";
        Date date = Date.valueOf(str);
        System.out.println(date);
    }

}
