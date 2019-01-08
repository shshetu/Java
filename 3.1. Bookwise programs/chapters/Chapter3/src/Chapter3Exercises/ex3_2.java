package Chapter3Exercises;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ex3_2 {
    public static void main(String[] args) {
        //Program to calculate the square root
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values of a,b,c Respectively: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = b*b - 4*a*c;
        double dis = Math.pow(d,0.5);
        
        if (d>0) {
            System.out.println("Equation has 2 real,unequal roots!");
          double  r1 = (-b + dis)/(2*a);
          double  r2 = (-b - dis)/(2*a);
            System.out.println("R1: "+ r1 + " R2: "+ r2);
        }
        else if (d == 0) {
            System.out.println("Equation has one real root!");
              double  r = (-b)/(2*a);
              System.out.println("R1: " + r);
        }
        else if (d < 0) {
            System.out.println("Equation has 2 unequal,unreal roots!");
            double idis =  Math.pow(Math.abs(d),0.5);
            double  ir1 = (-b + idis)/(2*a);
          double  ir2 = (-b - idis)/(2*a);
            System.out.println("R1: "+ ir1 +"i" + " R2: "+ ir2 +"i");
             
        }else{System.out.println("Invalid Input!");}
        
        
        
    }
}
