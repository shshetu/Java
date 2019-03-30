/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_Java;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    String n = input.next();
    if(n.equals(new StringBuffer(n).reverse().toString())){
        System.out.println("Yes");
    }
    else{System.out.println("No");}
    }
  
}
