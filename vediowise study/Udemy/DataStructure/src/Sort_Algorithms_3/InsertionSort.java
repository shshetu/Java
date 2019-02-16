/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort_Algorithms_3;

import java.util.Date;


public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray ={20,35,-15,7,55,1,-22};
        //outer loop => loops from left to right
        for (int firstUnsrotedIndex = 0; firstUnsrotedIndex < intArray.length; firstUnsrotedIndex++) {
        int newElement = intArray[firstUnsrotedIndex]; 
        int i;
        //innerloop
            for (i = firstUnsrotedIndex; i > 0 && intArray[i-1]>newElement; i--) {
                //insert it
                intArray[i] = intArray[i-1];
                
            }
            intArray[i]= newElement;
        }
       
        //print the array
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
         
    }
}
