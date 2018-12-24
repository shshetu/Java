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
public class V42ReverseInteger1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();
        int temp = num;
      int sum = 0;  
      while(temp != 0){
      int r = temp % 10;
      sum = sum*10 + r;
      temp = temp / 10;
      }
        System.out.println("Reversed integer:"+sum);
    }
    
}
