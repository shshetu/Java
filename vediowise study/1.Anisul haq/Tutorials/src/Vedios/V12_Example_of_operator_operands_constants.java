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
public class V12_Example_of_operator_operands_constants {
public static void main(String[] args){
int num1,num2,result;
Scanner input = new Scanner(System.in);
System.out.print("Enter two numbers:");
num1 = input.nextInt();
num2 = input.nextInt();
double result1 = (double)num1/num2;
    System.out.println("Result:"+result1);
}

}
