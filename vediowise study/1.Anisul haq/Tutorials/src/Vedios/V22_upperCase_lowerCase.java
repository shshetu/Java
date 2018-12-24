/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vedios;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class V22_upperCase_lowerCase {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    char character = input.next().charAt(0);
    if(character>='a' && character<='z'){System.out.println("Lower Case!");}
    else if(character>='A' && character<='Z'){System.out.println("Upper Case!");}
    else{System.out.println("Not a character!");}
    }
    
}
