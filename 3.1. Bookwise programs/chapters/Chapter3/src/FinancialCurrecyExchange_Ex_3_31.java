
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shshe
 */
public class FinancialCurrecyExchange_Ex_3_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Enter 0 for dollar->RMB and 1 fro RMB->dollar:");
        double num = input.nextDouble();
        System.out.println("Enter the enchange rate from dollars to RMB:");
        double exchangeRate = input.nextDouble();
       
        double dollar,conRmb,rmb;
        if(num == 0){
        System.out.println("Enter the dollar amount: ");
         dollar = input.nextDouble();
         conRmb = dollar*exchangeRate;
            System.out.println("$"+dollar+" is "+conRmb+" yuan ");
        }else if(num == 1){
                System.out.println("Enter the RMB amount: ");
        rmb = input.nextDouble();
       double  conDollar = rmb/exchangeRate;
            System.out.println("$"+rmb+" is "+conDollar+" dollar ");
        }
    }
 
}
