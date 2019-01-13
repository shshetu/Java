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
public class Video114MethodOverridingTeacher extends Video114MethodOverridingPerson {
    String qualification;
    
    @Override
    void displayInformation(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Qualification: "+ qualification);
    
    }
}
