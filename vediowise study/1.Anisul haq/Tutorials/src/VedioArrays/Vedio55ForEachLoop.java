/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VedioArrays;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class Vedio55ForEachLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      //First Way to print Array
        //String[] name = new String[4];
      /* name[0] = "Shetu";
       name[1] = "Shanto";
       name[2] = "Nodi";
       name[3] = "Rafsan";
        
        for (int i = 0; i < 3; i++) {
            System.out.println(name[i]);
        }
      */
      
      //Second Way to print Array
      String[] name = {"Shetu","Shanto","Nodi","Tithi","Rafsan"};
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        
  //Using for each loop to print
      
      for(String x : name){
          System.out.print(x+" ");
      }
    }
}
