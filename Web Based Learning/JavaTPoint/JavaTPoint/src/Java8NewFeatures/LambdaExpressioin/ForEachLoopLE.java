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
public class ForEachLoopLE {
    public static void main(String[] args) {
      List<String> list = new ArrayList<>();
      list.add("Ankit");
      list.add("Mayank");
      list.add("Irfan");
      list.add("Jai");
      
      ///for each loop
      list.forEach(
      (n) ->System.out.println(n)
      );
        
    }
}
