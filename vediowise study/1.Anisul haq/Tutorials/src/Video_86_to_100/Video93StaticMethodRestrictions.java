/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_86_to_100;

/**
 *
 * @author shshe
 */
public class Video93StaticMethodRestrictions {
    
    ///instance variable
    int x = 10;
    
    //Non static method
    void display1(){
       // display2();
        System.out.println("I am a non static method!");
    }
    
    //static method
    static void display2(){
        
        System.out.println("I am a static method!");
        //System.out.println("X: "+ x);
    }
}
