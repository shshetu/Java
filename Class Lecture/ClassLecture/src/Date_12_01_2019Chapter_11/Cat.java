/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_12_01_2019Chapter_11;

/**
 *
 * @author User
 */
public class Cat extends AnimalTest{
   public void sound(){System.out.println("Meow!");}
    public static void main(String[] args) {
        AnimalTest obj = new Cat();
        obj.sound();
    }
}
