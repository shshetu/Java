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
public class First_Reverse {
    public static String FirstReverse(String str){
    return new StringBuffer(str).reverse().toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
       
        System.out.println(FirstReverse(input.nextLine()));

       
    }
    
}
