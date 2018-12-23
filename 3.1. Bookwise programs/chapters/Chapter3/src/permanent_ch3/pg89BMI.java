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
public class pg89BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in lbs:");
        double input_weight = input.nextDouble();
        System.out.println("Enter your Height in inch:");
        double input_height = input.nextDouble();
        double weight = input_weight*0.45359237;
        double height = input_height*0.0254;
        double bmi = weight/Math.pow(height,2);
        System.out.println(bmi);
        if(bmi<18.5){System.out.println("Under Weight!");}
        else if(bmi>=18.5 && bmi<25.0){System.out.println("Normal!");}
        else if(bmi>=25.0 && bmi<30.0){System.out.println("Over Weight!");}
        else if(bmi>=30){System.out.println("Obese!");}
        else{System.out.println("Wrong input!");}
        
    }
}
