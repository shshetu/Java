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
public class V20_Vowel_Constant {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    char ch = input.next().charAt(0);
    //    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='e'){System.out.println("Vowel!");}else{System.out.println("Cosonent!");}
    switch(ch){case 'a':case 'e':case 'i':case 'o':case 'u':System.out.println("Vowel!");break;
    default: System.out.println("Consonent!");
            }
    }
    
}
