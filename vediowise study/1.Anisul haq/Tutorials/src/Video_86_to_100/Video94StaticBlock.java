/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_86_to_100;

/**
 *
 * @author shshe
 */
public class Video94StaticBlock {
    static int id;
    static String name;
    
    //Initilizing static block(initializing statc block variables)
    static{
    id = 101;
    name = "Shetu";
    
    }
    
    //Display method
   static void display(){
        System.out.println("Id: "+ id);
        System.out.println("Name: "+ name);
    }
}
