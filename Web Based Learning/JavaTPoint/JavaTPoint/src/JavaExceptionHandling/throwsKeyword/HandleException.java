/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExceptionHandling.throwsKeyword;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shshe
 */
public class HandleException {
    
    //Creating a main method
    public static void main(String[] args) {
    M m = new M();
        try {
            m.method();
        } catch (IOException ex) {
            System.out.println("exception handled!");
        }
        System.out.println("Normal flow....");
    }
}
//create another class
 class M{
    void method() throws IOException{
    throw new IOException("device error");
    }}
