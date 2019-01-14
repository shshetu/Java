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
public class Video127Test {
    public static void main(String[] args) {
    Video127Person p = new Video127Person();
   p.display();
   
   p = new Video127Teacher();
   p.display();
   
    Video127Teacher t = new Video127Teacher();
      
    Video127Student s = new Video127Student();
    
    //Dynamic method dispatch
    
    
    //Calling the methods
   
    t.display();
    s.display();
    }
 
}
