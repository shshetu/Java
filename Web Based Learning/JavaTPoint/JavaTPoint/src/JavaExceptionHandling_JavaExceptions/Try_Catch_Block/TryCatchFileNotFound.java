/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExceptionHandling_JavaExceptions.Try_Catch_Block;

import java.io.PrintWriter;

/**
 *
 * @author shshe
 */
public class TryCatchFileNotFound {
    public static void main(String[] args) {
        PrintWriter pw;
        try {
            pw = new PrintWriter("jtp.txt");
            pw.println("saved");
            
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("File saved successfully!");
    }
  
}
