/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSorting;

/**
 *
 * @author User
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {10,2};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i]<a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Printing the sorted list: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
