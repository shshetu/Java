/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Easy_Difficulty;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.Scanner;

/**
Challenge
Have the function LetterCapitalize(str) take the str parameter being passed and capitalize the first letter of each word. Words will be separated by only one space.
Sample Test Cases

Input:"hello world"

Output:"Hello World"

Input:"i ran there"

Output:"I Ran There"

 */
public class LetterCapitalize {
   public static String letterCapitalize(String str){
   
       String str1 = StringUtils.capitalize(str);
       return  StringUtils.capitalize(str);
   }
    
    
    public static void main(String[] args) {
        System.out.println("Enter your String here: ");
        Scanner input = new Scanner(System.in);
        System.out.println(input.next());
    }
}
