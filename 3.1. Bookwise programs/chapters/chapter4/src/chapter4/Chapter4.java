/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
 *
 * @author User
 */
public class Chapter4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Mathematical Methods are consists of different types:
        1.Trigonometric
        2.Service : max, min, abs, random
        3.exponent:
        4. rounding: ceil,floor,rint,round
        */
        //Trigonometric Methods:
        System.out.println("Trigonometric Methods:");
        System.out.println(Math.toDegrees(Math.PI/2));
        System.out.println(Math.toRadians(30));
        System.out.println(Math.sin(0));
        System.out.println(Math.cos(Math.PI/2));
 
        
      //  System.out.println(Math.round(23.5));
 
      // System.out.println(Math.rint(23.5));
String s1 = "Hello", s2 = " World!";
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));
        System.out.println((int)(s1.charAt(0)));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.length());
        String x = "100";
        try{
        System.out.println(Integer.parseInt(x));
        } catch(Exception e){
            System.out.println("You can't");
        }
    }
    
}
