/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_IO.Console;
import java.io.*;
/**
 *
 * @author shshe
 */
public class Test {
    public static void main(String[] args) {
        String text = System.console().readLine();
        System.out.println("Text is: "+ text);
    }
}
