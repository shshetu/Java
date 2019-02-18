/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_IO.JavaFileInputStream;

import java.io.FileInputStream;

/**
 *
 * @author shshe
 */
public class DataStreamEx1 {
    public static void main(String[] args) {
        try {
          FileInputStream fin = new FileInputStream("D:\\test.txt");
         int i = fin.read();
            System.out.println((char)i);
            fin.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
