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
public class DataStreamEx2 {
    public static void main(String[] args) throws Exception{
        FileInputStream fin = new FileInputStream("D:\\test1.txt");
        int i = 0;
        while((i = fin.read())!= -1){
            System.out.println((char)i);
            
        }
        fin.close();
    }
}
