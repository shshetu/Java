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

///Call by values
public class Video102CallByValueTest {
    public static void main(String[] args) {
        Video102CallByValue obj = new Video102CallByValue();
int x = 20 ;
        System.out.println("x before call: "+ x);
obj.change(x);
        System.out.println("x after call: "+ x);
    }
 
   
   
    
}
