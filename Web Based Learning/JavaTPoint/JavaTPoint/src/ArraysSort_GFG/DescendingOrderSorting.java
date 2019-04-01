/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysSort_GFG;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author shshe
 */
public class DescendingOrderSorting {

    public static void main(String[] args) {
        // Note that we have Integer here instead of 
        // int[] as Collections.reverseOrder doesn't 
        // work for primitive types. 
        Integer[] arr = {13, 7, 6, 45, 21, 9, 2, 100};

        // Sorts arr[] in descending order 
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.printf("Modified arr[] : %s",Arrays.toString(arr));
    }
}
