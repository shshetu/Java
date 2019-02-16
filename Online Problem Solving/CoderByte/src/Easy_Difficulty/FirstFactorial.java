/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Easy_Difficulty;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author shshe
 */
public class FirstFactorial {
    public static int Factorial(int num){
    if(num==0||num==1){return 1;}
    else
    return num*Factorial(num-1);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Factorial(Integer.parseInt(input.nextLine())));
    }
}
