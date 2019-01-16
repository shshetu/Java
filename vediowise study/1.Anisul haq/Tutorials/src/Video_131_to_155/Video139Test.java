/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_131_to_155;

/**
 *
 * @author shshe
 */
public class Video139Test {
    public static void main(String[] args) {
        //Creating Anonymous class
        Video139Person p = new Video139Person(){
        @Override
        void display(){
            System.out.println("Method overriding using anonymous class without inheritence!");
            System.out.println("Test Class!");
        }
        };
        //invoke the anonymous class or method
       p.display(); 
    }
}
