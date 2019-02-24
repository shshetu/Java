/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_IO.Reader;

import java.io.FileReader;
import java.io.Reader;
import java.io.FileOutputStream;

/**
 *
 * @author shshe
 */
public class ReaderEx {
    public static void main(String[] args) {
        try {
        Reader reader = new FileReader("D:\\Idb\\git\\Shetu's git\\Java\\Web Based Learning\\JavaTPoint\\JavaTPoint\\src\\Java_IO\\Reader\\Files\\file.txt");
          int data = reader.read();
          while(data != -1){
              System.out.println((char)data);
              data = reader.read();
          }
          reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
