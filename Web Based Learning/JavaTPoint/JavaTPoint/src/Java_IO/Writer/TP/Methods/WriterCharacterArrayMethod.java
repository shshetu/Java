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
public class WriterCharacterArrayMethod {
    public static void main(String[] args) {
        try {
            //create a writer object 
            Writer writer = new PrintWriter(System.out);
            
            ///Character type Array
            char[] c1 = {'H','e','l','l','o'};
            char[] c2 = {'W','o','r','l','d'};
            
            //Use Character Array
            writer.write(c1);
            //Flush the writer
            writer.flush();
            //Use Character Array
            System.out.println("\n");
            writer.write(c2);
            //Flush the writer
            writer.flush();
            
            //close the stream
            writer.close();
            
        } catch (Exception e) {
        }
    }
   
}
