/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temporary;

/**
 *
 * @author User
 */
public class SeleectionSort {
    public static void main(String[] args) {
         int[] intArray = {20,35,-15,7,55,1,-22};
         //outer loop
         for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            //inner loop
             for (int i = 0; i <=lastUnsortedIndex ; i++) {
                 int largest = 0;
                 if(intArray[i]>intArray[largest]){
                 largest = i;
                 }
                 swap(intArray,largest,i);
             }
        }
          //printing the sorted array
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    
    }
    public static void swap(int[] array,int i,int j){
    if(array[i]== array[j]){return;}
      int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
    }
    
}
