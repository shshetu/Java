/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WordFile310;

/**
 *
 * @author User
 */
public class Q1 {
 
   public static void main(String args[]) {
 class Foo {
 public int i = 3;
 }
Object o = (Object)new Foo();
Foo foo = (Foo)o;
//Foo foo = new Foo();  
System.out.println("i = "+ foo.i);
 }
     
    
}
