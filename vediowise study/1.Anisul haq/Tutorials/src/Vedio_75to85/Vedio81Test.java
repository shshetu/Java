/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vedio_75to85;

public class Vedio81Test {
    
    
    public static void main(String[] args) {
//We know that class is the blueprint of object 
//We will create an object using a Class Vedio81Teacher
/*
Vedio81Teacher teacher1 ; //Declaring Object teacher1
teacher1 = new Vedio81Teacher(); //Creating object using new
*/

//Using Single line statement we can create an object
// new is an operator that creates a new object
Vedio81Teacher teacher1 = new Vedio81Teacher(); //Declare and create object teacher1
// Here the object teacher1 now have all the properties like:name, gender,phone from Vedio81Teacher class
teacher1.name = "Shahariar Shetu";
teacher1.gender = "Male";
teacher1.phone = 1624967336;
        System.out.println("Name: " + teacher1.name +"\nGender: "+ teacher1.gender
        + "\nPhone: "+ teacher1.phone);
        
 //                   Creating the 2nd Object
 Vedio81Teacher teacher2 = new Vedio81Teacher();
 teacher2.gender = "Female";
 teacher2.name = "Mehnaz Chowdhury";
 teacher2.phone = 1689737610;
        System.out.println("\t2nd Teacher:");
        System.out.println("Name: "+ teacher2.name);
        System.out.println("Gender: "+ teacher2.gender);
        System.out.println("Phone: "+ teacher2.phone);
       
//                  Creating 3rd Object
Vedio81Teacher teacher3 = new Vedio81Teacher();
teacher3.name = "Khadija Khatun";        
teacher3.gender = "Female";        
teacher3.phone = 1232324252;
 System.out.println("\t3rd Teacher:");
        System.out.println("Name: "+ teacher3.name);
        System.out.println("Gender: "+ teacher3.gender);
        System.out.println("Phone: "+ teacher3.phone);
       
    }
   
   
   
}
