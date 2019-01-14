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
public class Video130Test {
   //We can not instantiate an abstract method
    //But we can create instance variable
    public static void main(String[] args) {
     Video130MobileUser mu;
    mu = new Video130Rahim();
    mu.sendMessage();
    mu = new Video130Karim();
    mu.sendMessage();
       
    }
    
}
