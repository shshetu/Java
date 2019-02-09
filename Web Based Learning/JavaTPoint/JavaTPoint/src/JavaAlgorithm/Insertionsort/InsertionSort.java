/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAlgorithm.Insertionsort;

/**
 *
 * @author User
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {10,9,7,101,23,44,12,78,34,23};
        for (int k = 1; k < 10; k++) {
             //initially k = 1 that means 2nd value, a[1] = 9
           
             int temp = a[k]; //here keeping the value a[i] = 9 in temp variable
             int j = k-1; //here j = 1-1, j = 0
             while (j>=0 && temp<=a[j]) {                
                a[j+1] = a[j];
            }
        }
    }
   
}
