/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vedios;

/**
 *
 * @author Hp
 */
import java.util.Scanner;
public class V11_How_to_get_user_input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number:");
        int number = input.nextInt();
        System.out.println(number);
       */ 
     /*
       Scanner input = new Scanner(System.in);
        String name1 = input.next();
        System.out.println(name1);
*/
     Scanner input = new Scanner(System.in);
     String name2 = input.nextLine();
     System.out.print(name2);
}
}
