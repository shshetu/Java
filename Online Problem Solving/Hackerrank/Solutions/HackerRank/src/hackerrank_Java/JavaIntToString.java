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
public class JavaIntToString {
    public static void main(String[] args) {
        try {
       System.out.println("Enter your number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String str = String.valueOf(num);
        if(num == Integer.parseInt(str)){
            System.out.println("Good job!");
        }else{
            System.out.println("Wrong Answer.");     
        } 
        }catch (Exception e) {
                e.printStackTrace();
        
        }
        
        
    }
}
