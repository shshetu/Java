/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author User
 */
public class TryCatchExample10 {
    public static void main(String[] args) {
        PrintWriter  pw; //decalring instance variable
        
        try{
        pw = new PrintWriter("jtp.txt"); //initialization
        pw.println("saved!");
        }
        //providing the checked exception handler
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        System.out.println("File saved successfully!");
    }
 
}
