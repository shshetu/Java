/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_09_01_2019Chapter10;

/**
 *
 * @author User
 */
public class B extends A { ///Inheritance Parent: B and Child:A
    //Since B = Child Class and A= parent Class 
    // We can use sayHallo Mehtod from A in B
    //But when we use the abstract method we don't need 
    @Override
    public void display(){
        System.out.println("Hi...... I am B");
    }
    
    public void sayHello(){
        System.out.println("Hello I am from B.... How are you?");
    }
    
}
