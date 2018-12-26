/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VedioString;

/**
 *
 * @author Hp
 */
public class Vedio71StringBuffer1 {
    public static void main(String[] args) {
        
                    /// Use of StringBuffer
        
        ///Declare and print 
        StringBuffer sb = new StringBuffer("Shahariar");
        System.out.println(sb);
        
        //append()
        sb.append(" Shetu");
        System.out.println(sb);
        
        //reverse()
        sb.reverse();
        System.out.println(sb);
        
        //delete(0,5) start:0th, end:4th
        sb.delete(0,5);
        System.out.println(sb);
        
        //setLength(5)
        sb.setLength(5);
        System.out.println(sb);
        
        //Creating new String using StringBuffer
        String s2 = "Mehnaz";  ///String Builder
        StringBuffer sb1 = new StringBuffer(s2);
        System.out.println(sb1);
        
        sb1.append("Shanto");
        System.out.println(sb1);
        
        sb1.reverse();
        System.out.println(sb1);

        sb1.delete(0, 3);
        System.out.println(sb1);

        sb1.setLength(3);
        System.out.println(sb1);
    }
  
}
