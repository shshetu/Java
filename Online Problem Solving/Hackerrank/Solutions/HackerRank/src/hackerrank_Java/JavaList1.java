/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class JavaList1 {

    static String arlist(List list, int index, int num, int index2) {
        String x = "";
        list.add(index, num);
        list.remove(index2);
        for (Object l : list) {
            x +=" "+ l;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List list = new ArrayList();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

//        int n1 = sc.nextInt();
        System.out.println("Insert");
        int index = sc.nextInt();
        int num = sc.nextInt();

        System.out.println("Delete");
        int index2 = sc.nextInt();

        System.out.println(arlist(list, index, num, index2));
    }
}
