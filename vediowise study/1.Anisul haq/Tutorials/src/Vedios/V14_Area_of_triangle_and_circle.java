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
public class V14_Area_of_triangle_and_circle {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
    System.out.print("Enter 1 for square calculation:");
    int a = input.nextInt();
    if(a==1){
System.out.print("Enter the side of Square:");
double s = input.nextDouble();
double area = Math.pow(s,2);
System.out.print(area);}
}
}
