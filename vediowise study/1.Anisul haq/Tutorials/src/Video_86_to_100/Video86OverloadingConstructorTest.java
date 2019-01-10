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
public class Video86OverloadingConstructorTest {
    public static void main(String[] args) {
        System.out.println("\tThis is called Mehtod Overloading!");
        Video86OverloadingConstructor t1 = new Video86OverloadingConstructor();
        
        Video86OverloadingConstructor t2 = new Video86OverloadingConstructor("Shetu","Male");
        t2.displayInfo();
        
        Video86OverloadingConstructor t3 = new Video86OverloadingConstructor("Shetu","Male",1234);
        t3.displayInfo();
    }
   
}
