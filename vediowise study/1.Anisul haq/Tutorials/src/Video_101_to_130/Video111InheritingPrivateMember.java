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
public class Video111InheritingPrivateMember {
   private String name;
   private int age;
  
   //setter and getter for name
   public void setName(String name){
   this.name = name;
   }
   public String getName(){
   return name;
   }
   
   //Setter and getter for age
   public void setAge(int age){
   this.age = age;
   }
   public int getAge(){
   return age;
   }
   
   void displayInfo1(){
       System.out.println("Name: "+ name);
       System.out.println("Age: "+ age);
   }
  
    
}
