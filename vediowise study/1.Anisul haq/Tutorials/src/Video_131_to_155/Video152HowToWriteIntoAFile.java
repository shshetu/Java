/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_131_to_155;

import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class Video152HowToWriteIntoAFile {
    public static void main(String[] args) {
        //It is the best practice to use try catch block for file formatting
//        try{
//         Formatter formatter = new Formatter("C:/Users/shshe/OneDrive/Desktop/Person/Student.txt");
//         formatter.format("%s %s\r\n","101","Shetu");
//         formatter.format("%s %s\r\n","102","Shanta");
//         formatter.format("%s %s\r\n","103","Nodi");
//         formatter.close();
//        }catch(Exception e){System.out.println(e);}
//       
    String id,name;
try{
    Formatter formatter = new Formatter("C:/Users/shshe/OneDrive/Desktop/Person/Student.txt");
    Scanner input = new Scanner(System.in);
    System.out.println("Enter How many lines you want to print: ");
    int num = input.nextInt();
    
    //Creating a loop to input data
    for (int i = 0; i < num; i++) {
        System.out.println("Enter id and name: ");
        id = input.next();
        name = input.next();
        formatter.format("%s %s\r\n ", id,name);
    }
    
    
    
    formatter.close();
    
    
}catch(Exception e){System.out.println(e);}
    
    
    }
    
}
