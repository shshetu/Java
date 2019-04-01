/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysSort_GFG;

import java.util.Arrays;

/**
 *
 * @author shshe
 */
public class AscendingOrderSorting {

    public static void main(String[] args) {
        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
        Arrays.sort(arr);
        System.out.printf("Modified arr[]: %s", Arrays.toString(arr));
    }
}
