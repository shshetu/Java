/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClassAttribute;

/**
 *
 * @author User
 */
public class Person {
  ////////////////data fields/ states/////////////
    String fname ;
  String lname ;
  int age;
  //////////////////////////////////////////////

  //behaviour or actions or methods
  
//constructor
  Person(String fname,String lname,int age){

  this.fname = fname;
  this.lname = lname;
    this.age = age;
  }
  //Method
  void display(){
      System.out.println("Fitst Name: "+ fname);
      System.out.println("Last Name: "+ lname);
      System.out.println("Age: "+ age);
  }
  
  public static void main(String[] args) {
    Person myObj = new Person("Shetu","Shahariar",25);
    myObj.display();
   
  }
}