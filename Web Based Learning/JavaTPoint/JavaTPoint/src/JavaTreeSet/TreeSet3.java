/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaTreeSet;

import java.util.TreeSet;

/*Methods(object is Always used)
1 set.pollFirst() : will return the highest value
2 set.pollLast() : will return the lowsest value
*/
public class TreeSet3 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);
        System.out.println("Highest Value: "+ set.pollFirst());
        System.out.println("Lowest Value: "+ set.pollLast());
    }
}
