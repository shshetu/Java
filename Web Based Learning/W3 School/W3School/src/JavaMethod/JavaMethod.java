/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMethod;

/**
 *
 * @author User
 */
public class JavaMethod {
   static String  name;
   static{
   name = "Shetu";
   }
   static void myMethod(String fname){
       System.out.println(fname+" Refsnes");
       System.out.println("Name: "+ name);
   }
    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
    }
}


