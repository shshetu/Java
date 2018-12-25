/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VedioArrays;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author shetu
 */
public class Vedio66ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(456);
        number.add(4);
        number.add(49);
        number.add(-9);
        number.add(329);
        number.add(-49);
        System.out.println("Array List before sorting: "+ number);
        Collections.sort(number);
        System.out.println("Array List after sorting in ascending order: "+ number);
   Collections.sort(number,Collections.reverseOrder());
        System.out.println("Array List in descending order; "+ number);
    }
    
}
