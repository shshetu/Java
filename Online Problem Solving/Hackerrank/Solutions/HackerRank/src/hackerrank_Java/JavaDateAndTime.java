/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_Java;

import java.time.LocalDate;
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
        LocalDate date = LocalDate.of(year, month, day);
        
        System.out.println(date.getDayOfWeek());
    }
}
