/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class pg132ReadingAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three word seperately:");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
        System.out.println(s1 + s2 + s3);
        int p = 5000;
        System.out.println(String.valueOf(p));
    }
}
