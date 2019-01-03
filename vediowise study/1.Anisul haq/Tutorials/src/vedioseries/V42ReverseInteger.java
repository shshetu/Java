/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vedioseries;
import java.util.Scanner;
/**
 *
 * @author shetu
 */
public class V42ReverseInteger {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = input.nextInt();
        int temp = num;
        while(temp!=0)
        {int r = temp%10;
        System.out.print(r);
        temp = temp/10;
    }
 
}
}