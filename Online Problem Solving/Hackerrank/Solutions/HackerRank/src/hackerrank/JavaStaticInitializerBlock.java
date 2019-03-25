/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class JavaStaticInitializerBlock {
  //static variables
    static int B;
    static int H;
    static boolean flag;
    static{
    //scanner class inside the static block
        Scanner input = new Scanner(System.in);
        B= input.nextInt();
        H= input.nextInt();
        if(B>0&&H>0){
        flag = true;
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args) {
       if(flag){
       int area = B*H;
           System.out.println(area);
       } 
    }
} 
