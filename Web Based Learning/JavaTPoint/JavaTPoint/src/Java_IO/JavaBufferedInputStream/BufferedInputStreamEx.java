/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_IO.JavaBufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 *
 * @author shshe
 */
public class BufferedInputStreamEx {
    public static void main(String[] args) throws Exception{
        FileInputStream fin = new FileInputStream("D:\\test1.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        int i ;
        while((i=bin.read())!=-1){
            System.out.println((char)i);
        }
        bin.close();
        fin.close();
    }
}
