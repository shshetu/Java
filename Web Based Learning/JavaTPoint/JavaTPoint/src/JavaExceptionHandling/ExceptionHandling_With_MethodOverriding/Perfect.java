/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExceptionHandling.ExceptionHandling_With_MethodOverriding;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shshe
 */

class Parental{
void msg() throws Exception{
    System.out.println("Parent!");
}
}
public class Perfect extends Parental{
    @Override
    void msg() throws Exception{
        System.out.println("Child");
    }
    public static void main(String[] args) {
        Parental p = new Perfect();
        try {
            p.msg();
        } catch (Exception ex) {
            Logger.getLogger(Perfect.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
