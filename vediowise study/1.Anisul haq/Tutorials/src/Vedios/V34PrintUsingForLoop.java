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
public class V34PrintUsingForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0,sumEven=0,sumOdd=0;
        System.out.println("Enter the Starting Number:");
        int sn = input.nextInt();
        System.out.println("Enter the Ending Number:");
        int en = input.nextInt();
       /* for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }*/
      /*  for (int i = sn; i <= en; i++) {
            System.out.println(i);
            sum+=i;
           
        } 
System.out.println("Sum="+sum);*/
     System.out.println("Even numbers:");
      for (int i = sn; i <= en; i++) {
          
            if (i%2==0) {
                
                System.out.print("Even:"+i);
                sumEven+=i;
            }else{System.out.println("\tOdd:"+i);
            sumOdd+=i;
            }
            
           
        } 
System.out.println("\nEven Sum="+sumEven);
System.out.println("Odd Sum="+sumOdd);
    }
}
