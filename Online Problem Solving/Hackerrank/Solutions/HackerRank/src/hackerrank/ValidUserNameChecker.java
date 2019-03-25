/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
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
        String pattern  = "^\\p{Alpha}([\\p{Alnum}_]){7,29}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(username);
        if(m.find()){
            System.out.println("Valid!");
        }
        else{
            System.out.println("Invalid!");
        }
        testCases--;
        }
    }
}
