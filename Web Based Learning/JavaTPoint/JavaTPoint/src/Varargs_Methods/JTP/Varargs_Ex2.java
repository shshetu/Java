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
public class Varargs_Ex2 {
   static void display(String... values){
       System.out.println("display method is invoked!");
       for(String s:values){
           System.out.println(s);
       }
   }
    public static void main(String[] args) {
        display();
        display("hello");
        display("my","name","is","varargs");
    }
}
