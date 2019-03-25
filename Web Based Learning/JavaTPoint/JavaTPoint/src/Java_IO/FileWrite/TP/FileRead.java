/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_IO.FileWrite.TP;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author shshe
 */
public class FileRead {
    public static void main(String[] args) throws IOException {
        //declare the file
        File file = new File("Hello.txt");
        
        //creates the file
        file.createNewFile();
        
        //creates a FileWriter Object
        FileWriter writer = new FileWriter(file);
        
        //writes the content to the file
        writer.write("This\n is\n an\n example\n");
        writer.flush();
        writer.close();
        
        //Creates a FileReader Object
        FileReader fr = new FileReader(file);
        char[] a = new char[50];
        fr.read(a); //reads the content to the array
        for(char c: a){
            System.out.println(c); //prints the characters one by one
            fr.close();
        }
        
    }
}
