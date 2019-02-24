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
 * @author shshe
 */
public class Append3 {
    public static void main(String[] args) {
        try {
            CharSequence csq = "Hello World!";
            Writer writer = new PrintWriter(System.out);
            writer.append("This is an Example!",11,19);
            writer.flush();
            writer.append(csq,0,5);
            writer.flush();
        } catch (Exception e) {
        }
    }
  
}
