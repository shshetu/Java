/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vedios;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class V18_conditional_statements {
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int x = input.nextInt();
  if(x>0){System.out.println("Positive");}else if(x==0){System.out.println("Zero");}else{System.out.println("Negative");}
  }

}
