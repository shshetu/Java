/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permanent_ch3;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Pg89BMIBD {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in kg:");
        double weight = input.nextDouble();
        System.out.println("Enter your height in feet-inch:");
        double feet = input.nextDouble();
        double inch = input.nextDouble();
        double height = (feet*12 + inch)*(2.54/100);
        double bmi = weight/Math.pow(height,2);
        System.out.println(" Your BMI: " + bmi);
        //System.exit(0); //normal termination
        if(bmi<18.5){System.out.println("Underweight!");}
        else if(bmi<25){System.out.println("Normal!");}
        else if(bmi<30){System.out.println("Overweight!");}
        else if(bmi>30){System.out.println("Obese!");}
        else{System.out.println("Wrong input!");}
    }
}
