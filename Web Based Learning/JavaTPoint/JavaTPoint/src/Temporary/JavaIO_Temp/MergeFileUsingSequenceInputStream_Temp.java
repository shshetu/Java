/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temporary.JavaIO_Temp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

/**
 *
 * @author shshe
 */
public class MergeFileUsingSequenceInputStream_Temp {
    public static void main(String[] args) {
        try {
            FileInputStream fin1 = new FileInputStream("D:\\test.txt");
            FileInputStream fin2 = new FileInputStream("D:\\test1.txt");
            FileOutputStream fout = new FileOutputStream("D:\\addtest.txt");
            SequenceInputStream sin = new SequenceInputStream(fin1,fin2);
            int i ;
            while((i=sin.read())!=-1){fout.write(i);}
            sin.close();
            fout.close();
            fin1.close();
            fin2.close();
            System.out.println("Successfully Merged two files!");
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
