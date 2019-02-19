/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_IO.JavaSequenceInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author shshe
 */
public class SequenceInputStreamUsingEnumeration {
    public static void main(String[] args) throws IOException{
        FileInputStream fin1 = new FileInputStream("D:\\test.txt");
        FileInputStream fin2 = new FileInputStream("D:\\test1.txt");
        FileInputStream fin3 = new FileInputStream("D:\\temp.txt");
        FileInputStream fin4 = new FileInputStream("D:\\temp1.txt");
        
        //creating Vector object to all the streams
        Vector v = new Vector();
        v.add(fin1);
        v.add(fin2);
        v.add(fin3);
        v.add(fin4);
        
        //creating enumeration object by calling th elements method
        Enumeration e = v.elements();
        
        //passing the enumeration object in the constructor
        SequenceInputStream bin = new SequenceInputStream(e);
        int i=0;
        while((i= bin.read())!=-1){
            System.out.println((char)i);
        }
        bin.close();
        fin1.close();
        fin2.close();
        fin3.close();
        fin4.close();
    }
 
}
