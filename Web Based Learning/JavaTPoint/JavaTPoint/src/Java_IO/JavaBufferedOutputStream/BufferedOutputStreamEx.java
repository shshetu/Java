/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_IO.JavaBufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 *
 * @author shshe
 */
public class BufferedOutputStreamEx {
    public static void main(String[] args) throws Exception{
        FileOutputStream fout = new FileOutputStream("D:\\test1.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Welcome to JavaTpoint";
        byte[] b = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Success..");
    }
}
