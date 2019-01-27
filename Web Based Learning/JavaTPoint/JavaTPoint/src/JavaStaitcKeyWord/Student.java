/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaStaitcKeyWord;

//Static method releted example
public class Student {
  int rollno; //instance variables
String name;
static String college = "ITS"; //static variable

//static method to change the value of static variable
static void change(){college = "BBDIT";}

//constructor to initialize the variable
Student(int r, String n){
rollno = r;
name = n;
}

//method to display values
void display(){System.out.println(rollno+" "+name+" "+college );}


}
