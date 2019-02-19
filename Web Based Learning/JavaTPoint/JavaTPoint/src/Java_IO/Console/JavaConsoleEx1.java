/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_IO.Console;

import java.io.Console;
import java.io.IOException;

/**
 *
 * @author shshe
 */
public class JavaConsoleEx1 {
    public static void main(String[] args) throws Exception{
        Console c = System.console();
        System.out.println("Enter your name: ");
        String n = c.readLine();
        System.out.println("Welcome "+ n);
    }
    
}
