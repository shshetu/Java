/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vedios;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class V35Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inSum=0;
       /* 
        double sum=0,sum1=0,sum2=0,sum3=0;
       
        System.out.print("Enter the starting number:");
        double sn = input.nextDouble();
        System.out.print("Enter the ending number:");
        double en = input.nextDouble();
         System.out.println("\nPrinting Series:1+2+3+.....+n");
        for (double i = sn; i <= en; i++) {
            System.out.print(" "+i);
            sum+=i;
        }
        System.out.println("\nSum of series(1+2+3+...+n):"+sum);
    System.out.println("\nPrinting Series:1+3+5+.....+n");
    for (double i = sn; i <= en; i=i+2) {
            System.out.print(" "+i);
            sum1+=i;
        }
        System.out.println("\nSum of series(1+3+5+.....+n):"+sum1);
        
        System.out.println("\nPrinting Series:1.5+2.5+3.5+.....+n");
    for (double i = sn+.5; i <= en; i=i+1) {
            System.out.print(" "+i);
            sum2+=i;
        }
        System.out.println("\nSum of series(1.5+2.5+3.5+.....+n):"+sum2);
    
           System.out.println("\nPrinting Series:1^2+2^2+3^2+.....+n^2");
    for (double i = sn; i <= en; i=i+1) {
            System.out.print(" "+i*i);
            sum3+=i*i;
        }
        System.out.println("\nSum of series(1^2+2^2+3^2+.....+n^2):"+sum3);
 
    */
       System.out.print("Enter the starting number:");
        double sn1 = input.nextDouble();
        System.out.print("Enter the ending number:");
        double en1 = input.nextDouble();
        System.out.print("Enter the difference:");
        double d = input.nextDouble();
        System.out.print("Series:");
        for (double i = sn1; i <=en1 ; i=i+d) {
            System.out.print(" "+i);
            inSum+=i;
        }
        System.out.print("\nSum of the series="+inSum);
    }
  
}
