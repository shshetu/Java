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
public class Video102CallByRefereceTest {
    public static void main(String[] args) {
        Video102CallByReferece r1 = new Video102CallByReferece();
        r1.name = "Shetu";
        System.out.println("Before CallingP: "+ r1.name);
        
        r1.change(r1);
        System.out.println("After Calling: "+ r1.name);
    }
}
