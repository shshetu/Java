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
public class Vedio82StudentTest {
    public static void main(String[] args) {
        //Creating Object
        Video82Student student1 = new Video82Student();
        
//Inputing the values of Student class one by one
student1.name = "Shetu";
student1.gender = "Male" ;
student1.roll = 03;
student1.age = 25;
        student1.displayInformation();
        
        //Creating 2nd Object
        Video82Student student2 = new Video82Student();
//Inputing the values of Student class one by one
student2.name = "Shanta";
student2.gender = "Female";
student2.roll = 01;
student2.age = 25;
        student2.displayInformation();
        
        
    }
}
