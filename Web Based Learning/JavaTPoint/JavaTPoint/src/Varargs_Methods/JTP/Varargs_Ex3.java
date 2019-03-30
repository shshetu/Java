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
public class Varargs_Ex3 {
   static void display(int num,String... values){
       System.out.println("number is "+num);
       for(String s:values){
           System.out.println(s);
       }
   }
    public static void main(String[] args) {
        display(500,"hello");
        display(1000,"my","name","is","varargs");
    }
}
