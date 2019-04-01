/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8NewFeatures.LambdaExpressioin;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shshe
 */
public class ForEachLoopLA {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");
        //using for each loop
        list.forEach(
        (n) -> System.out.println(n)
        );
        
    }
}
