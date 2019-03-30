/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Easy_Difficulty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author shshe
 */
public class CheckNumsUsingComparator {

    int num;

    public CheckNumsUsingComparator(int num) {
        this.num = num;
    }

}

class NumberCompartor implements Comparator<CheckNumsUsingComparable> {

    @Override
    public int compare(CheckNumsUsingComparable t, CheckNumsUsingComparable t1) {
        if (t.num == t1.num) {
            return 0;
        } else if (t.num > t1.num) {
            return 1;
        } else {
            return -1;
        }
    }

}

class Test2 {

    public static void main(String[] args) {
        List<CheckNumsUsingComparable> list = new ArrayList<CheckNumsUsingComparable>();
        list.add(new CheckNumsUsingComparable(3));
        list.add(new CheckNumsUsingComparable(122));
        list.add(new CheckNumsUsingComparable(67));
        //sort using comparator
        Collections.sort(list,new NumberCompartor());
        //for each loop to print
        for (CheckNumsUsingComparable c : list) {
            System.out.println(c.num);
        }
    }
}
