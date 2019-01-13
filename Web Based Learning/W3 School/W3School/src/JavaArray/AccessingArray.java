/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaArray;

/**
 *
 * @author shshe
 */
public class AccessingArray {
    public static void main(String[] args) {
        String[] cars = {"BMW","Volvo","Ferarri"};
        System.out.println(cars[0]);
        
        //Changing Array Element
        cars[0] = "Opel";
        System.out.println(cars[0]);
        
        //Printing Array length
        System.out.println("Array Length: "+ cars.length);
        
        //Looping through using for loop and length property for controlling
        for (int i = 0; i < cars.length ; i++) {
            System.out.println(cars[i]);
        }
        //Using for each
        for(String i:cars){System.out.println(i);}
    }
  
}
