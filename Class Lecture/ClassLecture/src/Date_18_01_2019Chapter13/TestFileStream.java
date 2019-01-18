/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_18_01_2019Chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author User
 */
public class TestFileStream {
    public static void main(String[] args) throws IOException {
       try(
          //Create an output stream to the file
               FileOutputStream output = new FileOutputStream("temp.dat");
               ){
       //Output values to the file
           for (int i = 1; i <= 10; i++) {
               output.write(i);
           }
           try(
                   //Create an input stream for the file
                   FileInputStream input = new FileInputStream("temp.dat");
                   ){
           //Read values from the file
           int value;
           while((value = input.read()) != -1)
                   System.out.println(value+ " ");
           }
       
       }
           
    }
}
