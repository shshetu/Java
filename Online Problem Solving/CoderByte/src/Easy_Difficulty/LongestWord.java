/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Easy_Difficulty;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class LongestWord {
    public static void main(String[] args) {
        //keep this function call here
        Scanner input = new Scanner(System.in);
        System.out.println(LongestWord(input.nextLine()));
    }
 ///method
    public static String LongestWord(String sen){
    sen.trim();
        return sen;
    }
}
