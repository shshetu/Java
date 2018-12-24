/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vedios;

/**
 *
 * @author Hp
 */
import java.util.Scanner;
public class V39Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int count=0;
        int num = input.nextInt();
        for(int i=2;i<num;i++){if(num%i==0){count++;break;}}
        if(count==0){System.out.println("Prime!");}else{System.out.println("Not Prime!");}
       
     
    }
}
