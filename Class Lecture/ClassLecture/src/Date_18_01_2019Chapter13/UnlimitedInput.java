/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_18_01_2019Chapter13;

/**
 *
 * @author User
 */
public class UnlimitedInput {
   int count = 0;
     int sum = 0;
     //Using varArgs method processing input
   void display(int ... num){
 
   for(int x:num){
       if(x%2 == 0 )
       {
           sum+= x;
       }
   
   count++;
   }
       System.out.println("Sum: "+ sum);
       System.out.println("SUbtraction: "+ (sum - 10*count));
   }
}
