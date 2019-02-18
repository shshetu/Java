/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_IO.JavaFileOutputStream;

//Writing a String

import java.io.FileOutputStream;

public class FileOutputStreamEx2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("D:\\test1.txt");
        String s = "Welcome to Javatpoint";
        byte b[] = s.getBytes();
        fout.write(b);
        fout.close();
            System.out.println("success..");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
