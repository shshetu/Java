/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temporary.JavaIO_Temp;

import java.io.FileOutputStream;

/**
 *
 * @author shshe
 */
public class FileOutputStreamEx_String_Temp {
    public static void main(String[] args) throws Exception{
       FileOutputStream fout = new FileOutputStream("D:\\temp1.txt");
       String s = "I love JavatPoint";
       byte[] b = s.getBytes();
       fout.write(b);
       fout.close();
        System.out.println("Success...");
    }
   
}
