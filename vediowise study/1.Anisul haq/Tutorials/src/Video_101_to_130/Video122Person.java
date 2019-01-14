/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_101_to_130;

/**
 *
 * @author shshe
 */
public class Video122Person {
    String name;
    int age;
    String hairColor;
    
    
    Video122Person(String name,int age){
    this.name = name;
    this.age = age;
    }
    
    //Making 3 parameter constructor
    Video122Person(String name,int age,String hairColor){
    this(name,age);
    this.hairColor = hairColor;
    }
    
    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Hair Color: "+ hairColor);
    }
}
