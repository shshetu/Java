/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temporary.JavaIO_Temp;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author shshe
 */
public class BufferedInputStream_Temp {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("D:\\InputOutputStream.txt");
            String s = "I love Java";
            byte[] b = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Writing Successful..");
            
            FileInputStream fin = new FileInputStream("D:\\InputOutputStream.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while((i=bin.read())!=-1){
                System.out.println((char)i);
            }
            fin.close();
            bin.close();
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
