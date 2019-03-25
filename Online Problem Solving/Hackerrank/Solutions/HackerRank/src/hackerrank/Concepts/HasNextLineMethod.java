/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.Concepts;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class HasNextLineMethod {
   
    public static void main(String[] args) {
      String s = "Hello World! \n 3+3.0 = 6";
   
    //create a new scanner with the specified String Object
   Scanner input = new Scanner(s);
   
   //print the next line
        System.out.println(""+ input.nextLine());
        
        //checks if there is a next line again
        System.out.println(""+ input.hasNextLine());
        
        //print the next line
        System.out.println(""+ input.nextLine());
        
        //check if there is a next line again
        System.out.println(""+ input.hasNextLine());
        
        //close the scanner
        input.close();
    }
}
