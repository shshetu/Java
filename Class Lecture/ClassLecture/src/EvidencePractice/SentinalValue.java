/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvidencePractice;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SentinalValue {
    public static void main(String[] args) {
        int num1;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        while(true){
        System.out.println("Enter your number: ");
        num1 = input.nextInt();
        if(num1 != -1){
        sum += num1;
        System.out.println("Sum: "+ sum);    
        }else {
            System.out.println("Your last sum: "+ sum);
            break;}
        }
    }
}
