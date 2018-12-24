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
public class V15_Temperature_conversion {
    public static void main(String[] args){
        System.out.println("Enter the Farenheight:");
        Scanner input = new Scanner(System.in);
    float far = input.nextFloat();
    float cel = (float)(0.56)*(far-32);
            System.out.println("Converted into Celcius:"+cel);

    }
}
