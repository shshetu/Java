/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_IO.FileWriter;

import java.io.FileWriter;

/**
 *
 * @author shshe
 */
public class FileWriterEx {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("D:\\Idb\\git\\Shetu's git\\Java\\Web Based Learning\\JavaTPoint\\JavaTPoint\\src\\Java_IO\\FileWriter\\testout.txt");
            fw.write("Welcome to Javatpoint");
            fw.close();
        } catch (Exception e) {
        e.printStackTrace();
        }
        System.out.println("Success..");
    }
}
