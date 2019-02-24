/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_IO.Writer;

import java.io.FileWriter;
import java.io.Writer;

/**
 *
 * @author User
 */
public class JavaWriterExample1 {
    public static void main(String[] args) throws Exception{
     Writer w = new FileWriter("D:/Idb/git/Shetu's git/Java/Web Based Learning/JavaTPoint/JavaTPoint/src/Java_IO/Writer/Files/output.txt");
     String content = "I Love my Country";
     w.write(content);
     w.close();
        System.out.println("Done!");
        
    }
}
