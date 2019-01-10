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
public class Video89StaticVariablePart1 {
   String name;
   int id;
   static String universityName = "JU";

   ///Creating parameterized constructor
   Video89StaticVariablePart1(String n, int i){
   name = n;
   id = i;
   }
   
   //Displaying information
   void displayInfo(){
       System.out.println("Name: "+ name);
       System.out.println("Id; "+ id);
       System.out.println("University Name: "+ universityName);
   }
   
   
   
}

