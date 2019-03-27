/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8Date.JavaUtilDate;

import java.util.Date;

/**
 *
 * @author shshe
 */
public class UtilDate1 {

    public static void main(String[] args) {
        //1st way 
        Date date = new Date();
        System.out.println(date);
        
        //2nd way
        Date date1 = new Date(System.currentTimeMillis());
        System.out.println(date1);
    }
}
