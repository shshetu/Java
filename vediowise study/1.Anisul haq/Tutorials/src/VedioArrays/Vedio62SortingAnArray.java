/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VedioArrays;

import java.util.*;

/**
 *
 * @author Hp
 */
public class Vedio62SortingAnArray {
    public static void main(String[] args) {
        int[] number = {-2,6,7,4,10,4};
        Arrays.sort(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print("  " + number[i]);
        }
    }
}
