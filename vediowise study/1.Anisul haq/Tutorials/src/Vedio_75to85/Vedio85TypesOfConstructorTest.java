/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vedio_75to85;

/**
 *
 * @author shshe
 */
public class Vedio85TypesOfConstructorTest {
    public static void main(String[] args) {
   Vedio85TypesOfConstructor  s1 = new Vedio85TypesOfConstructor("Shetu","Male",25) ;
   s1.displayInfo();
   
   //Creating another object without any parameter. 
      Vedio85TypesOfConstructor  s2 = new Vedio85TypesOfConstructor() ;
s2.displayInfo();
   
//Creating another object with 2 parameter constuctor 
      Vedio85TypesOfConstructor  s3 = new Vedio85TypesOfConstructor("Shanta","Female") ;
s2.displayInfo();


   
    }
}
