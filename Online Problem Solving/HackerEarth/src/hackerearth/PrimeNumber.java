/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author shshe
 */
public class PrimeNumber {
static int count= 0;
static int p =0;
  public static int prime(int num){
   
    
      for (int i = 1; i <= num; i++) {
           if(i==1){continue;}
          for (int j = 2; j <i; j++) {
           
              if(i%j == 0){count++;break;}

          }
          if(count==0){ p+=i; System.out.println(i);}
          count=0;
      }
   return 0;
             
  }
    public static void main(String[] args) throws Exception{
        System.out.println("Enter your number: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) {});
     
        System.out.println(prime(Integer.parseInt(br.readLine())));
    }
    
}
