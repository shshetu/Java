/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vedios;

/**
 *
 * @author Hp
 */
import java.util.Scanner;
public class V38TimeTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number for time table:");
        int sn = input.nextInt();
        System.out.print("Enter the last number for time table:");
        int en = input.nextInt();
        for(int j=sn;j<=en;j++){
        for (int i = 1; i <= 10; i++) {
           int table = j*i;
            System.out.println("\n"+j+"X"+i+"="+table);
        }
        }
    }
}
