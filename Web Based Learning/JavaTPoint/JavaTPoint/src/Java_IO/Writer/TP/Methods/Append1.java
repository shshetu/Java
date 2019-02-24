/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_IO.Writer.TP.Methods;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 We use: Writer append(char c)
 */
public class Append1 {
    public static void main(String[] args) throws IOException{
        //create a new Writer Object
        String location = "D:\\Idb\\git\\Shetu's git\\Java\\Web Based Learning\\JavaTPoint\\JavaTPoint\\src\\Java_IO\\Writer\\Files\\Append1.txt";
        Writer writer = new FileWriter(location);
        
        //append a char by directly passing the character
        writer.append('c');
        
        //append a new char
        writer.append('C');
        
        writer.flush();
        writer.close();
        System.out.println("File is written to: "+ location);
    }
}
