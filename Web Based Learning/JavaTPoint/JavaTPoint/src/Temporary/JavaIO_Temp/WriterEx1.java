/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temporary.JavaIO_Temp;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author shshe
 */
public class WriterEx1 {
    public static void main(String[] args) throws IOException {
        Writer w = new FileWriter("D:/Idb/git/Shetu's git/Java/Web Based Learning/JavaTPoint/JavaTPoint/src/Java_IO/Writer/Files/output.txt");
        String content = "I Love My Mother!";
        w.write(content); 
        w.close();
        System.out.println("Done!");
    }
   
}
