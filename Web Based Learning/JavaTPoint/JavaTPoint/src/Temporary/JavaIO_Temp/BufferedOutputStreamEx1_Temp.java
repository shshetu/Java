/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temporary.JavaIO_Temp;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 *
 * @author shshe
 */
public class BufferedOutputStreamEx1_Temp {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("D:\\bufferedoutput.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            String s = "I love JavaTpoint";
            byte[] b = s.getBytes();
            bout.write(b);
            bout.flush();
            fout.close();
            System.out.println("Writing successful.....");
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
