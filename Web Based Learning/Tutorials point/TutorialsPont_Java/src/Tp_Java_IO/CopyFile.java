/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tp_Java_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author shshe
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            ///creating an object of FileInputStream and OutputStream
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");
            int c;
            while((c = in.read())!= -1){
            out.write(c);
            }
        } catch (Exception e) {
        }
        finally{
        if(in != null){in.close();}
        if(out != null){out.close();}
        }
      
    }
}
