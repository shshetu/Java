/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.temporary;

import hackerrank.*;
import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class JavaStringTokensTemp {

    public static void main(String[] args) {
        //Read input
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        //turn it into a String Array
        String[] words = s.split("[^a-zA-Z]+");
        System.out.println(words.length);
        for (String wor : words) {
            System.out.println(wor);
        }
        scan.close();
    }
}
