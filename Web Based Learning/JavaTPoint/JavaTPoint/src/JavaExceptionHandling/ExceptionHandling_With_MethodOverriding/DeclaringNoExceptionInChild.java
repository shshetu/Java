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
class Parentals{
void msg() throws Exception{System.out.println("Parent!");}
}
public class DeclaringNoExceptionInChild extends Parentals{
    @Override
    void msg(){
        System.out.println("Child!");
    } 
    
    public static void main(String[] args) {
        Parentals p = new DeclaringNoExceptionInChild();
        try {
            p.msg();
        } catch (Exception ex) {
            Logger.getLogger(DeclaringNoExceptionInChild.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
