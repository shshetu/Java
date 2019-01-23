package Listing;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Algorithms
//1. Prompt the user to enter filling status
//2.Prompt the user to enter taxable income
//3.Compute tax
//4.Display result
public class ComputeTaxesListing3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
//1. Prompt the user to enter filling status
System.out.println("Enter your status: ");
String inStatus = input.next();

//2.Prompt the user to enter taxable income
System.out.println("Enter your taxable income: ");
double income = input.nextInt();
double tax;
//3.Compute tax
if(inStatus == "single"){
    if (income<=8350) {
        tax = 1.10*income;
    }else if (income<=33950) {
        tax = (0.10*8350)+(income - 8350)*0.15; 
    }else if (income <=82250) {
 tax = (0.10*8350)+(33950 - 8350)*0.15+(income - 33950)*0.25; 
    }else if (income<=171550) {
   tax = (0.10*8350)+(33950 - 8350)*0.15 + (income - 33950)*0.25;       
    }else if (income<=372950) {
       tax = (0.10*8350)+(33950 - 8350)*0.15;   
    }else if (income>372950) {
      tax = (0.10*8350)+(33950 - 8350)*0.15;    
    }
}else System.out.println("Under Consturnction!");
//4.Display result
    }
}
