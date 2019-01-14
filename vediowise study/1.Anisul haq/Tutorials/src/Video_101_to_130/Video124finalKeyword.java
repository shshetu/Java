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
public class Video124finalKeyword {
  final  String UNIVERSITY_NAME = "JU"; //restricts the user name
   final int fees ; //Blank final variable
   static final String location;
  
   //for static final variable
   static{location = "Dhaka";}

//for blank final variable   
   Video124finalKeyword(){
   fees = 3434;
   } 
   
    
    void display(){
        System.out.println("University Name: "+ UNIVERSITY_NAME);
        System.out.println("University fees: "+ fees);
        System.out.println("Location: "+ location);
        
    }
}
