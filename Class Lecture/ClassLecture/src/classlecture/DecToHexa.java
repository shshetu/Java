/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classlecture;

/**
 *
 * @author User
 */
public class DecToHexa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 1128;
        int sum = 0,sum1 = 0;
        int temp = number;
         while(temp != 0){
         int r = temp % 16;
         sum = 10*sum + r;
         temp = temp/16;
         }
         int temp1 = sum;
         while(temp1 != 0){
         int r1 = temp1 % 10;
         sum1 = 10*sum1 + r1;
         temp1 = temp1/10;
         }
         
         System.out.println("Sum: " + sum1);
    }
    
}
