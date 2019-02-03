/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvidenceSelfPractice;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class PrintArrayAndSum {
    
    ///Soring Method
   public void sort(){
   Scanner input = new Scanner(System.in);
       System.out.println("How many numbers you want to enter: ");
       int n = input.nextInt();
       double[] array = new double[n];
       System.out.println("Enter "+n+" numbers: ");
       
       //Taking input
       for (int i = 0; i <n; i++) {
           array[i] = input.nextDouble();
       }
       
       //Printing input
       System.out.println("Array you have inputed: ");
       for(double x: array){
           System.out.print(" "+x);
       }
       //Sorting
       for (int i = 0; i < n; i++) {
           for (int j = i+1; j < n; j++) {
            if(array[i]>array[j]){
            double temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            }   
           }
       }
       System.out.println("");
       
       //Printing Array in ascending order
       System.out.println("Printing Array in asceding order: ");
       for(double y:array){
           System.out.print(" "+y);
       }
       System.out.println("");
       
       //Printing array in descending order
       System.out.println("Printing Array in descending order:");
       for (int i = n-1; i >= 0; i--) {
           System.out.print(" "+array[i]);
       }
       //Max Min
       System.out.println("\nMin value: "+ array[0]);
       System.out.println("Max value: "+ array[n-1]);
       //Sum of the values
       System.out.print("Sum of the values: ");
       double sum = 0;
       for (int i = 0; i < n; i++) {
           sum+=array[i];
       }
       System.out.print(sum);
       //Average of the values
       double avg = sum/n;
       DecimalFormat o = new DecimalFormat("0.00");
       System.out.println("\nAverage of the values: "+ o.format(avg) );
   
       
   }
   
                         ///Check prime
   void checkPrime(){
       int count = 0;
       System.out.println("\n\tCheck Prime or Not?");
       System.out.print("Enter any number to check: ");
       Scanner input = new Scanner(System.in);
       int num = input.nextInt();
       if(num==0||num==1){System.out.println("Not Prime!");}
       else if(num == 2 ){System.out.println("Prime!");}
       else{
           for (int i = 2; i < num; i++) {
               if(num%i == 0){count++;break;}
           }
           if(count==0){System.out.println("Prime!");}
           else{System.out.println("Nor prime");}
       }
   }
   
            //Print prime for a given sequence
   void primeSequence(){
       Scanner input = new Scanner(System.in);
       System.out.println("\n\t*****Prime Sequence printing*****");
         System.out.println("Enter the starting number: ");
       int sn = input.nextInt();
         System.out.println("Enter the ending number: ");
       int en = input.nextInt();
       int count =0;
       int total = 0;
       ///Processing the prime sequence
       for (int i = sn; i <=en ; i++) {
           if(i == 0 || i ==1 ){continue;}
           
           for (int j = 2; j < i; j++) {
               if(i%j == 0){count++;break;}
           }
           if(count==0){System.out.print(" "+i);total++;}
      count = 0;
       //Printing the prime sequence
       }
       System.out.println("\nTotal: "+ total);
        
       //Factorial using recursion
//       void facRecur(){
//   
//   }
//   
        //Factorial using for loop
     
   }
      void fac(){
       Scanner input = new Scanner(System.in);
          System.out.println("\n\t*****Factorial Program*****");
          System.out.println("Enter the number to factorize: ");
          int num = input.nextInt();
          int fac = 1;
          for (int i = num; i >0 ; i--) {
              fac*=i;
          }
          System.out.println("Factorial of "+5+"! = "+ fac);
   }
    //Find fibonocchi  
   void fibo(){
       Scanner input = new Scanner(System.in);
       System.out.println("\n\t*****Fibonocchi Number Finding program*****");
       System.out.println("How many numbers you want to print: ");
       int num = input.nextInt();
       int a=0,b=1,result=0;
       System.out.print("0 1");
       for (int i = 0; i < num-2; i++) {
           result+= a+b;
                System.out.print(" "+ result);
           a=b;
           b= result;
      result = 0;
       }
       
   }
   ///Find PalindromeNumber
   void paliNum(){
   Scanner input = new Scanner(System.in);
       System.out.println("\n\t*****Palindrome number checking program*****");
       System.out.println("Enter the number: ");
       int num = input.nextInt();
       int temp = num;
       int sum = 0;
       while(temp!=0){
       int r = temp%10;
       sum = sum*10 + r;
       temp = temp/10;
       }
       System.out.println("The Reversed number: "+sum);
       if(num == sum){System.out.println("Palindrome!");}
       else{System.out.println("Not palindrome");}
   }
   //Palindrome String
   void paliString(){
   Scanner input = new Scanner(System.in);
       System.out.println("\n\t*****Palindrome String checking program*****");
       System.out.println("Enter your name: ");
       String name = input.nextLine();
       StringBuffer sb = new StringBuffer(name);
       String revName = sb.reverse().toString();
       System.out.println("Reversed Name: "+ revName);
       if(name.equalsIgnoreCase(revName)){System.out.println("Palindrome!");}
       else{System.out.println("Not Palindrome!");}
   }
   void sort2DForEach(){
       Scanner input = new Scanner(System.in);
       System.out.println("*****Sorting 2D Array Program*****");
       System.out.println("Enter the size of your 2D Array:");
      int r = input.nextInt();
      int c = input.nextInt();
       double[][] array = new double[r][c];
       System.out.println("Enter "+r*c+" elements of the array: ");
       //Taking input
       for (int i = 0; i < r; i++) {
           for (int j = 0; j < c; j++) {
               array[i][j] = input.nextDouble();
           }
       }
       //Sorting a 2D Array
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int is = 0; is < r; is++) {
                    for (int js = 0; js < c; js++) {
                        if(array[is][js]>array[i][j]){
                        double temp = array[is][js];
                        array[is][js] = array[i][j];
                        array[i][j] = temp;
                        }
                    }
                }
            }
       }
         //Printing th Array
       for(double x[]:array){
           //Arrays.sort(x);
       for(double y: x){
           System.out.print("\t"+y);
       }
         System.out.println("");  
       }
   }
       
   
     
   
   
    public static void main(String[] args) {
       PrintArrayAndSum obj = new PrintArrayAndSum();
      // obj.sort();
      // obj.checkPrime();
//       obj.primeSequence();
        //obj.fac();
//        obj.fibo();
   // obj.paliNum();
    //obj.paliString();
    obj.sort2DForEach();
    }
}
