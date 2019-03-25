/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.Concepts.DecimalFormatSymbols;

import java.text.DecimalFormat;

/**
 *
 * @author shshe
 */
public class DecimalFormatSymbols {
 
    public static void main(String[] args) {
      String pattern = "#,###.###";
      double number = 126473.4567;

      DecimalFormat decimalFormat = new DecimalFormat(pattern);

      System.out.println(decimalFormat.format(number));
   

      DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
      decimalFormatSymbols.setDecimalSeparator(';');
      decimalFormatSymbols.setGroupingSeparator(':');

      decimalFormat = new DecimalFormat(pattern, decimalFormatSymbols);

      System.out.println(decimalFormat.format(number));
   }
}
