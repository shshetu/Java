/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VedioArrays;
import java.util.ArrayList;


/**
 *
 * @author shetu
 */
public class Vedio63ArrayList {
    public static void main(String[] args) {
    ArrayList<Integer> number = new ArrayList<>();
        System.out.println("Size of ArrayList: " + number.size());
       number.add(0,10);
       number.add(1,20);
       number.add(2,30);
       number.add(40);
        System.out.println(number);
        for(int x: number){
            System.out.println(x);
        }
       number.remove(0);
        System.out.println("After removing 0th element: "+ number);
        number.removeAll(number);
        System.out.println("After removing all element: "+ number);
    }
}
