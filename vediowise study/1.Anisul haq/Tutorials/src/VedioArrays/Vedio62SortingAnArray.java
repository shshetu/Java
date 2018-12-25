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
        int[] number = {-3,56,3,5,7,2};
        Arrays.sort(number);
        for (int i = 0; i < number.length; i++) {
            System.out.println(" "+number[i]);
        }
        for (int i = number.length -1 ; i >= 0; i--) {
            System.out.print(" " + number[i]);
        }
        String[] name = {"Shetu","Nodi","Shanta"};
        Arrays.sort(name);
        System.out.println("Ascending Order: ");
        for (int i = 0; i < name.length; i++) {
            System.out.print("` " + name[i]);
        }
        System.out.println("Descending Order: ");
        for (int i = name.length -1; i >= 0; i--) {
            System.out.print(" " + name[i]);
        }
    }
}
