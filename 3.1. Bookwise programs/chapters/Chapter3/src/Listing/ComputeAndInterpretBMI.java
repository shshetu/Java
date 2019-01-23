/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listing;

import java.util.Scanner;

//Algorithms:
//1.Prompt the weight in pound *
//2.Prompt the height in inches **
//3.Convert these into Kg and cm
//4. Calculate the result according to the rule and print the result
public class ComputeAndInterpretBMI {
    //Page- 89
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Pormpt the user to enter weight in pounds
        System.out.println("Enter weight in  pounds: ");
        double weight = input.nextDouble();
        
        //Prompt the user to enter the height in inch
        System.out.println("Enter the height in inches: ");
        double height = input.nextDouble();
        
        final double KILOGRAMS_PER_POUND = 0.45359237; //inputing the constant
        final double METERS_PER_INCH = 0.0254; //Constant
        
        //Compute BMI
        double weightInKilograms = weight* KILOGRAMS_PER_POUND;
        double heightInMeter = height* METERS_PER_INCH;
        double bmi = weightInKilograms/(double)(Math.pow(heightInMeter,2));
        
        //Display Result
        System.out.println("BMI is: "+ bmi);
        if(bmi<18.5){System.out.println("Underweight");}
        if(bmi<25){System.out.println("Normal");}
        if(bmi<30){System.out.println("OverWeight");}
        else System.out.println("Obese");;}
    }

