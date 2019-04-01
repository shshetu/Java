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
public class SortInAlphabeticOrder {

    public static void main(String[] args) {
        String arr[] = {"parctice.geeksforgeeks.org", "quiz.geeksforgeeks.org", "code.geeksforgeeks.org"};
        Arrays.sort(arr);
        System.out.printf("Modified arr[]: \n %s\n\n", Arrays.toString(arr));
        //descending orders
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
