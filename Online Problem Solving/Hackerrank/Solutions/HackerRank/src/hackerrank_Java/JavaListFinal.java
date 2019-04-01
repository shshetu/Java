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
public class JavaListFinal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            l.add(element);
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            //insert qery
            String query = sc.next();
            if (query.equals("Insert")) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                l.add(x, y);
            } else if (query.equals("Delete")) {
                int x = sc.nextInt();
                l.remove(x);
            }
        }
        //print
        for(int o:l){
            System.out.print(o+" ");
        }
        sc.close();
    }
}
