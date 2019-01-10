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
public class Vedio85TypesOfConstructor {
    String name,gender;
    int age;
    
//Default Constructor
    //If there is no constructor in the class than a default constructor will be auto generated
    Vedio85TypesOfConstructor(){
        System.out.println("No Value!");
    }
    
    //2 parameter constructor
    Vedio85TypesOfConstructor(String n,String g){
        name = n;
        gender = g;
    }
    
//Parameterized constuctor
     Vedio85TypesOfConstructor (String n,String g,int a){
     name = n;
     gender = g;
     age = a;
     }
     
//Creating Display Method
     void displayInfo(){
         System.out.println("Name: "+ name);
         System.out.println("Gender: "+ gender);
         System.out.println("Age: "+ age);
     }
}
