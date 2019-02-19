/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_IO.JavaDataOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author shshe
 */
public class DataOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("D:\\testout.txt");
        DataOutputStream data = new DataOutputStream();
        
    }
}
