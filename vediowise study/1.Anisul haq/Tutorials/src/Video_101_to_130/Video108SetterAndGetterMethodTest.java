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
public class Video108SetterAndGetterMethodTest {
 
    public static void main(String[] args) {
     //Creating Object
    Video108SetterAndGetterMethod person1 = new Video108SetterAndGetterMethod();
   
    //inputting attributes/state using set method:
   person1.setName("Shetu");
    
    //Getting values
        System.out.println("Name: "+ person1.getName());
        
        //Inputing and Outputting age:
        person1.setAge(25);
        System.out.println("Age: "+ person1.getAge());
        
        //Inputtina and outputting mobile:
        person1.setMobile(32434534);
        System.out.println("Mobile: "+ person1.getMobile());
        
    }
   

        
}
