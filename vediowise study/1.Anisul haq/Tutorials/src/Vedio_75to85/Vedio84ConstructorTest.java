/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vedio_75to85;

/**
 *
 * @author shshe
 */
//Class defines state and behaviour
public class Vedio84ConstructorTest {
    String name,gender;
    int phone;
    
   //Creating a constructor
    Vedio84ConstructorTest(String n, String g, int ph){
    name = n;
    gender = g;
    phone = ph;
    }
  
    ///Non parameteized Method (Defines Actions)
    void displayInfo(){
      
        System.out.println("");
        System.out.println("Name: "+ name);
        System.out.println("Gender: "+ gender);
        System.out.println("Phone: "+ phone);
    }
}
