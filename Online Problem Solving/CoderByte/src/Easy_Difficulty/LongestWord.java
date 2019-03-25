/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Easy_Difficulty;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class LongestWord {
   public String LongestWord(String sen){
   
      return sen;
   }
   //Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the single line: ");
        String s = input.nextLine();
        
        //split the sentence using split() method and put them in Array
        String arr[] = s.split(" ");
//        System.out.println("The line is seperated into words: ");
//        for(String b:arr){
//            System.out.print(b+" ");
//        }
//bubble sort
        for (int i = 0; i < arr.length; i++) {
            for(int j= i+1;j<arr.length;j++){
            if(arr[i].length()>arr[j].length()){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            }
            }
            
        }
               System.out.println(arr[arr.length-1]);

        
    }
}
