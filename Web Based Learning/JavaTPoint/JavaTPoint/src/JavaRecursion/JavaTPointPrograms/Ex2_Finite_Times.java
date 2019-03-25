/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaRecursion.JavaTPointPrograms;

/**
 *
 * @author shshe
 */
public class Ex2_Finite_Times {
   static int count = 0;
  static void p(){count++;
  if(count<=5){System.out.println("Hello! "+ count);}
  p();}
    public static void main(String[] args) {
       p();
    }
  
}
