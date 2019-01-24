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
public class Geometry_Point_in_a_circle_Ex_3_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1 = 0;
        double y1 = 0;
        System.out.println("Enter a point with two coordinates:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width = 10;
        double height = 5;
        System.out.print("Point "+"("+x2+","+y2+")");  
//Hint: A point is in the rectangle if its horizontal distance to (0,0)
//is less than 10/2 and its vertical distance from (0,0 is less than 
//or equal 5/2
double horizontalDistance = Math.sqrt(x2-x1);
double verticallDistance = Math.sqrt(y2-y1);
if(horizontalDistance<= width/2 && verticallDistance<= height/2){
    System.out.print(" is in the rectangle");
}else{System.out.print(" is not in the rectangle");}
    }
}
