/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_IO.JavaFileOutputStream;

import java.io.FileOutputStream;

/**
 *
 * @author shshe
 */
public class FileOutputStreamExample {
    public static void main(String[] args) {
        try {
//FileOutputStream fout = new FileOutputStream("D:\Idb\git\Shetu's git\Java\Web Based Learning\JavaTPoint\JavaTPoint\src\Java_IO\JavaFileOutputStream\\test.txt");
  FileOutputStream fout = new FileOutputStream("D:\\test.txt");
  fout.write(65); //write A into the file
  fout.close();
            System.out.println("success....");
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
    
}
