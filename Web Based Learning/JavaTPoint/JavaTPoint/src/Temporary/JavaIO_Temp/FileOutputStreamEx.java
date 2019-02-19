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
public class FileOutputStreamEx {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("D:\\temp.txt");
            fout.write(65);
            fout.close();
            System.out.println("success!");
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
