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
public class V39PrimeNumbersTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to test:");
        int num = input.nextInt();
        int count = 0;
        if(num==0||num==1){System.out.println("Not Prime!");}
        else if(num==2){System.out.println("Prime!");}
        else{
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                count++;
                break;
            }
        }
        if (count == 0) {
          System.out.println("Prime!");      
        }else{
            System.out.println("Not Prime!");
        }
        }
    }
    
}
