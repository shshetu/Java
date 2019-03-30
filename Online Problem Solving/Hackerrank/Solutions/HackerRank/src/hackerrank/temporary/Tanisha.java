/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.temporary;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author shshe
 */
public class Tanisha {

    public static void verify(int age) {
        if (age >= 18) {
            JOptionPane.showMessageDialog(null, "Congratulation! You can vote now!");
        } else {
            JOptionPane.showMessageDialog(null, "Sorry! You can not vote now!");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String tan = in.nextLine();
        System.out.println("Enter your age: ");
        int age = in.nextInt();
        verify(age);

    }
}
