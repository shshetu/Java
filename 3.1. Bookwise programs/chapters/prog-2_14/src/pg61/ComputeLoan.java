/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pg61;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class ComputeLoan {
    public static void main(String[] args){
  //Create a scanner
  Scanner input = new Scanner(System.in);
  //Enter annual interest rate
  System.out.print("Enter the annual interset rate:");
  double annualInterestRate = input.nextDouble();
///obtain monthly interest rate
double monthlyInterestRate = annualInterestRate/1200;
// Enter number of years
System.out.print("Enter the number of years:");
int numberOfYears = input.nextInt();
//Enter the loan amount
System.out.print("Enter the loan amount:");
double loanAmount = input.nextDouble();
//Calculate payment
double monthlyPayment = (loanAmount*monthlyInterestRate)/(1-(1/Math.pow(1+monthlyInterestRate, numberOfYears*12)));
double totalPayment = monthlyPayment*numberOfYears;
System.out.println("Monthly payment:"+monthlyPayment);
System.out.print("Total payment"+totalPayment);
    }
}
