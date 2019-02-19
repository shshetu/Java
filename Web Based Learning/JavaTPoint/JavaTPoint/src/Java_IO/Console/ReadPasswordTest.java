/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_IO.Console;

import java.io.Console;

/**
 *
 * @author User
 */
public class ReadPasswordTest {
    public static void main(String[] args) throws Exception{
        Console c = System.console();
        System.out.println("Enter Password: ");
        char[] ch = c.readPassword();
        String pass = String.valueOf(ch);
        System.out.println("Password is: "+ pass);
        
    }
}
