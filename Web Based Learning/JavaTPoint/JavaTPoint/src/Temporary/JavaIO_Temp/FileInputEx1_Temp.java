/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temporary.JavaIO_Temp;

import java.io.FileInputStream;

/**
 *
 * @author shshe
 */
public class FileInputEx1_Temp {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("D:\\temp1.txt");
            int i;
            while((i=fin.read())!=-1){
                System.out.println((char)i);
            }
            fin.close();
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
