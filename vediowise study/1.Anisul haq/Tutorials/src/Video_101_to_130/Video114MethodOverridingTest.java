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
public class Video114MethodOverridingTest {
    public static void main(String[] args) {
      Video114MethodOverridingTeacher teacher1 = new Video114MethodOverridingTeacher();
      teacher1.name = "Shetu";
      teacher1.age = 25;
      teacher1.qualification = "Mathematics";
         System.out.println("No. 1");
      //invoking 
      teacher1.displayInformation();
     ///////////////////////////////////////
      Video114MethodOverridingPerson teacher2 = new Video114MethodOverridingPerson();
      teacher2.name = "Shanta";
      teacher2.age = 25;
     
         System.out.println("No. 2");
      //invoking 
      teacher2.displayInformation();
      
      
      //////Reference class Video114MethodOverridingPerson 
      //Instance class Video114MethodOverridingTeacher
      Video114MethodOverridingPerson p1 = new Video114MethodOverridingTeacher();
      p1.name = "Nodi";
      p1.age = 22;
      
// It is not allowed since qualification is not in reference so object is created of Person class
      
      //p1.qualification = "Islamic studies";
        System.out.println("No. 3");
      p1.displayInformation();
    }
}
