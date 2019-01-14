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
public class Video123Person {
    
    void message(){
        System.out.println("I am message method!");
    }
    
    void display(){
        message();
        this.message();
        System.out.println("I am display method!");
    }
}
