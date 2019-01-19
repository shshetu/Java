/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClassMethods;

/**
 *
 * @author User
 */
public class MyClassTest {
    public static void main(String[] args) {
        MyClass.myStaticMethod(); //Static methods in the same class does not need class name only outside the class we have to call
        
        MyClass obj = new MyClass(); //But for non static method we have to create object either on same class or outside the class.
        obj.myPublicMethod();
    }
}
