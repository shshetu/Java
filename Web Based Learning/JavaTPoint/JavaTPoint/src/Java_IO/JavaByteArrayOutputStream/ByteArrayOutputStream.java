/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_IO.JavaByteArrayOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;

/**
 *
 * @author shshe
 */
public class ByteArrayOutputStream {
    public static void main(String[] args) throws IOException{
        FileOutputStream fout1 = new FileOutputStream("D:\\f1.txt");
        FileOutputStream fout2 = new FileOutputStream("D:\\f2.txt");
        //writing into byte Array output stream
   ByteArrayOutputStream bout = new ByteArrayOutputStream();
        
    }
 
}
