/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permanent_ch3;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class pg87 {
    public static void main(String[] args) {
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        if(num1<num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        }
        int result = num1 - num2;
        System.out.println(" First number = "+ num1 + " Second number = "+ num2);
        System.out.println(" The difference: "+ num1 + "-" + num2 + " Result: "+result);
    }
    
}
