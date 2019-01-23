/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaEnum;

/**
 *
 * @author shshe
 */

public class MyClass {
    enum Level{LOW,MEDIUM,HIGH}; //We can conatin enum inside any class except the main class
    
    public static void main(String[] args) {
      // public enum Level{Low,Medium,High};   //we should not define enum inside the main class
    Level myVar = Level.HIGH; //enum can implement can not extend since it has a defult class
    //Here Level is Data type
    switch(myVar){
        case LOW: System.out.println("Low level!");break;
        case MEDIUM: System.out.println("Medium level!");break;
        case HIGH: System.out.println("High level!");break;
        
    }
    
    }
 
}
