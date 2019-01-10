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
public class Video92StaticMethodTest {
    
    public static void main(String[] args) {
        
        //Creating Object to invoke non static method display1
        Video92StaticMethod obj1 = new Video92StaticMethod();
        obj1.display1();
        Video92StaticMethod.display2();
    }
}
