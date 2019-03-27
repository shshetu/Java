/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class JavaStringTokens {

    public static void main(String[] args) {
        //Read input
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        s = s.trim(); ///so that .split() works properly
        //check special cases
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        //split on all non-alphabetic characters
//       String[] words = s.split("[^a-zA-Z]+");
        String[] words = s.split("[^a-zA-Z]+");
        //print output
        System.out.println(words.length);
        //use for each loop when we don't wanna deal with the last part
        for (String word : words) {
            System.out.println(word);
        }
    }
}
