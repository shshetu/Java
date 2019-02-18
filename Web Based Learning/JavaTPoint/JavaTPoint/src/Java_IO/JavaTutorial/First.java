/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_IO.JavaTutorial;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shshe
 */
public class First {
    public static void main(String[] args) {
        System.out.println("Simple Message");
        System.err.println("Error Message");
        try {
            int i = System.in.read();
            System.out.println((char)i);
        } catch (IOException ex) {
            Logger.getLogger(First.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
