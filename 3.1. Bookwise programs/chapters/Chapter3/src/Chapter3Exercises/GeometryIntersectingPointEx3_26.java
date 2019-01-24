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
public class GeometryIntersectingPointEx3_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1 , y1, x2, y2, x3, y3, x4, y4: ");
        double x1  = input.nextDouble();
        double y1  = input.nextDouble();
        double x2  = input.nextDouble();
        double y2  = input.nextDouble();
        double x3  = input.nextDouble();
        double y3  = input.nextDouble();
        double x4  = input.nextDouble();
        double y4  = input.nextDouble();
        
        //Calculate using creamer's rule
        double d = ((y1-y2)*(x3-x4))-((x1-x2)*(y3-y4));
       
    }
}
