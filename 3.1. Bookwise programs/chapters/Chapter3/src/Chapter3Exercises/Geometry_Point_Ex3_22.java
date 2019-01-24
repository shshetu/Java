/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3Exercises;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class Geometry_Point_Ex3_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates: ");
   double x2 = input.nextDouble();
   double y2 = input.nextDouble();
        System.out.println("Enter the radius: ");
        double r = input.nextDouble();
        System.out.print("Point "+"("+x2+","+y2+")");
    double distance = Math.sqrt(Math.pow((x2-0),2)+Math.pow(y2-0, 2));
        if (distance<= r) {
            System.out.print(" is in the circle");
        }else{System.out.println(" is not in the circle");}
    }
   
}
