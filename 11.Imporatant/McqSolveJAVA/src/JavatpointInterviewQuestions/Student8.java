/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavatpointInterviewQuestions;

/**
 *
 * @author User
 */
public class Student8 {
 int rollno;
 String name;
 static String college = "ITS";
 
 //Creating a parameterized constructor
 Student8(int r, String n){
 rollno = r;
 name = n;
 }
 
 //Method
 void display(){System.out.println(rollno+" "+name+" "+college);}
    public static void main(String[] args) {
        Student8 s1 = new Student8(111,"Karan");
        Student8 s2 = new Student8(222,"Aryan");
        s1.display();
        s2.display();
        
    }
   
}
