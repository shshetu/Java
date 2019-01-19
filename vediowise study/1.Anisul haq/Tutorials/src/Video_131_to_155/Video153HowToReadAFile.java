/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_131_to_155;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class Video153HowToReadAFile {
    public static void main(String[] args) {
        //Creating file using File Class
        //try catch block is a must for file create or formatter
        try{
        File file = new File("C:/Users/shshe/OneDrive/Desktop/Person/Student.txt");
        //Using Scanner class to read data
        Scanner scanner = new Scanner(file);
        
        //Using while loop to print out all the values
        while(scanner.hasNext()){
        String id = scanner.next();
        String name = scanner.next();
            System.out.println("ID: "+ id+ " Name: "+ name);
        }
        scanner.close(); ///scanner close is a must .without closing it will not print any data
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
