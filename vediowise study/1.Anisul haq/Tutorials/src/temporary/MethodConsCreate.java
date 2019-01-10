/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporary;

/**
 *
 * @author shshe
 */
public class MethodConsCreate {
    String name,gender;
    int age;
    
//Creating COnstructor
MethodConsCreate(String n,String g, int a){
name = n;
    gender = g;
    age = a;
}
        
   
    void displayInfo(){
        System.out.println("");
        System.out.println("Name: "+ name);
        System.out.println("Gender: "+ gender);
        System.out.println("Age: "+ age);
    }
}
