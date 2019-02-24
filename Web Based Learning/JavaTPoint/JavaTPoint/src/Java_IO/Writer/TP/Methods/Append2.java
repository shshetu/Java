/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_IO.Writer.TP.Methods;

import java.io.PrintWriter;
import java.io.Writer;

/**
 *
Writer append(CharSequence csq)
 */
public class Append2 {
    public static void main(String[] args) {
        try {
           Writer writer = new PrintWriter(System.out);
           CharSequence csq = "Hello World!";
           writer.flush();
           writer.append("This is an Example\n");
           writer.append(csq);
           writer.flush();
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
