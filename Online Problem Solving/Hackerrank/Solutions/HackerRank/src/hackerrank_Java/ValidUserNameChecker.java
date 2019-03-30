/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_Java;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author shshe
 */
public class ValidUserNameChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
        String username = in.nextLine();
        String pattern  = "[A-Za-z]{1}[A-Za-z0-9_]{7,29}";
        if(Pattern.matches(pattern, username)){
            System.out.println("Valid!");
        }
        else{
            System.out.println("Invalid!");
        }
        testCases--;
        }
    }
}
