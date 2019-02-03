/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvidenceSelfPractice;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class SentinalValue {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int sum = 0;
            while(true){
            System.out.print("\nEnter your number: ");
            double num = input.nextDouble();
            if(num!=-1){
            sum+=num;
                System.out.print("\nsum is: "+ sum);
            }else{
                   System.out.print("\nFinal sum is: "+ sum);
                break;
                    

            
            }
                           
            }
             
    }
}
