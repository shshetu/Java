/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_18_01_2019Chapter13;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ClassProblem {
   int a,b,c;
   
   //Create Method to display
   void display(){
   Scanner input = new Scanner(System.in);
   int[] array = new int[3];
   int sum = 0;
   int count = 0;
       System.out.println("Enter three numbers: ");
       
      ///Take input
        
        for(int j = 0;j<=2;j++){
        array[j] = input.nextInt();
        count++;
        }
       // check the divisibility
       for(int i = 0;i<=2;i++){
       if(array[i]%2 ==0){
       sum+= array[i];
       }
       }
       System.out.println("Sum: "+ sum);
       
    ///Subtraction
       int sub = sum - count*10;
       System.out.println("Subtraction: "+ sub);
   }
  
   
}
