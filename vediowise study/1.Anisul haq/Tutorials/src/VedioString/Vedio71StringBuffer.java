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
public class Vedio71StringBuffer {
    public static void main(String[] args) {
        String s1 = "Shahariar Shetu";
        System.out.println("Printing using String: "+ s1);
        
///Using StringBuffer
StringBuffer sb = new StringBuffer("Shahariar");
sb.append(" Shetu");
System.out.println("Using StringBuffer: "+ sb);

///Reversing StringBuffer
sb.reverse();
        System.out.println("Reversing StringBuffer: "+ sb);
        sb.reverse();
        
        ///Delete starts from index 0 and ends at index 4 for sb.delete(0,5)
        sb.delete(0,5);
        System.out.println(sb);
// We can set length of an StringBuffer
sb.setLength(5);
        System.out.println("Setting Length: "+ sb);
        
        ///We can also pass string in StringBuffer
        String s2 = "Shahariar Shetu";
        StringBuffer sb1 = new StringBuffer(s2);
        System.out.println("Passing String in StringBuffer: "+ sb1);







    }
  
}
