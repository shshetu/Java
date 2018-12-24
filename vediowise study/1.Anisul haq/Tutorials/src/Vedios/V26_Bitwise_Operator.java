/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vedios;

/**
 *
 * @author Hp
 */
public class V26_Bitwise_Operator {
  public static void main(String[] args){
    int a=32,b=16;int logical_And = a&b;int logical_Or = a|b;int logical_Xor = a^b;int left_shift_2 = a>>2;int left_shift_3= a>>3;
      System.out.println("Logical And"+logical_And);
      System.out.println("Logical Or"+logical_Or);
      System.out.println("Logical XOr"+logical_Xor);
      System.out.println("Left Shift_2:"+left_shift_2);
      System.out.println("Left Shift_3:"+left_shift_3);
  }
}
