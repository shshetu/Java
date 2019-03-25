/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Easy_Difficulty;

import com.sun.org.apache.xml.internal.security.encryption.Transforms;
import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class LetterChallenge {
    public static void main(String[] args) {
        System.out.println("Enter your string: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        
        //Using split method() we convert and a String into Array
        
        String arr[] = s.split("");
        
        //Convewrt String Array to char Array
   char[] transformS = s.toCharArray();
        System.out.println(transformS.length);
        
      
        }
        //use loop to change
       
        }
    

