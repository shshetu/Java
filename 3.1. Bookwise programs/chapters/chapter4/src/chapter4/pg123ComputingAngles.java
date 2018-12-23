/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class pg123ComputingAngles {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter the value of side a:");double a = input.nextDouble();
        System.out.println("Enter the value of side b:");double b = input.nextDouble();
        System.out.println("Enter the value of side c:");double c = input.nextDouble();
       double A = Math.toDegrees(Math.acos((b*b + c*c - a*a)/(2*b*c)));
       double B = Math.toDegrees(Math.acos((c*c + a*a - b*b)/(2*a*c)));
       double C = Math.toDegrees(Math.acos((a*a + b*b - c*c)/(2*a*b)));
        System.out.println("The angle A is = "+ A);
        System.out.println("The angle B is = "+ B);
        System.out.println("The angle C is = "+ C);
    }
}
