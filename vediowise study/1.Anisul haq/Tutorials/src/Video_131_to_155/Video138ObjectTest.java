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
public class Video138ObjectTest {
    public static void main(String[] args) {
       Video138Person p = new Video138Teacher(); //Upcasting
       Video138Teacher t = (Video138Teacher) new Video138Person(); //Downcasting
       //in java Downcasting does not support
       p.display();
       
       //it will produce Run time error
       t.display();
    }
 
}
