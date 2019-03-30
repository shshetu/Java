/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Varargs_Methods.JTP;

/**
 *
 * @author shshe
 */
public class Varargs_Ex1 {
   static void display(String... values){
       System.out.println("display method is invoked!");
   }
    public static void main(String[] args) {
        display();
        display("my","name","is","varargs");
    }
}
