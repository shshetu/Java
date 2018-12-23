/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporary;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class pg82 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
    int number = input.nextInt();
    switch(number/10){
        case 9: System.out.println("Grade is A");break;
        case 8: System.out.println("Grade is B");break;
        case 7: System.out.println("Grade is C");break;
        case 6: System.out.println("Grade is D");break;
        default: System.out.println("Grade is F");
    }
    
    }
    
}
