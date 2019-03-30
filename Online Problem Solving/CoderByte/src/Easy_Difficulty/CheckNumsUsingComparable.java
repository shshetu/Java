/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Easy_Difficulty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author shshe
 */
public class CheckNumsUsingComparable implements Comparable<CheckNumsUsingComparable> {

    int num;

    public CheckNumsUsingComparable(int num) {
        this.num = num;
    }

    @Override
    public int compareTo(CheckNumsUsingComparable t) {
        if (num == t.num) {
            return 0;
        } else if (num > t.num) {
            return -1;
        } else {
            return 1;
        }
    }

}

class Test {

    public static void main(String[] args) {
        List<CheckNumsUsingComparable> list = new ArrayList<CheckNumsUsingComparable>();
        list.add(new CheckNumsUsingComparable(3));
        list.add(new CheckNumsUsingComparable(122));
        //sort
        Collections.sort(list);
        //for each loop to print
        for (CheckNumsUsingComparable c : list) {
            System.out.println(c.num);
        }
    }
}
