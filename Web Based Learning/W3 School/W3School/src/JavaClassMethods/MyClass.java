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
public class MyClass {
  //Static Method
    static void myStaticMethod(){
        System.out.println("Static Methods can be called without creating objects");
        
    }
    
    //Public Method
    public void myPublicMethod(){
        System.out.println("Public methods must be called by createing objects");
    }
    
    //Main method 
    //Since Main method is inside the same class and there is static keyword 
    //so we can call static from static method
//    public static void main(String[] args) {
//        myStaticMethod(); //Call the static method
//        
//        ///But for public method we have to create an objcet
//        MyClass myObj = new MyClass();
//        myObj.myPublicMethod();
//        
//    }
    
}

