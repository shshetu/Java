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
public class Video86OverloadingConstructor {
    String name,gender;
    int phone;
    
    //Creating a default constructor
    Video86OverloadingConstructor(){
        System.out.println("No information!");
    }
    
    //Creating a parameterized constructor of 2 parameters
    Video86OverloadingConstructor(String n1, String g1){
        name = n1;
        gender = g1;
    }
    
    //Creating a 3 parameter constructor
    Video86OverloadingConstructor(String n2,String g2,int ph){
    name = n2;
    gender = g2;
    phone = ph;
    }
    
    //Creating a displayInformation method to print
    void displayInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Gender: "+ gender);
        System.out.println("Phone: "+ phone);
    }
    
    
}
