/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VedioString;

/**
 *
 * @author shetu
 */
public class Vedio69StringPart3 {
    public static void main(String[] args) {
       String country = "Bangladesh is my country";
       
       ///charAt() method returns character values
       char ch = country.charAt(0);
        System.out.println("Character at 0th position: "+ ch);
        
        //ASCII Value for charAt() method
        int value = country.charAt(0);
        System.out.println("ASCII Value at position 0: "+ value);
        
        //indexOf() method returns int value
        int pos = country.indexOf('n');
        System.out.println("Index of n at position: "+ pos);
        
        //LastIndexOf() method returns int value
        int pos1 = country.lastIndexOf('n');
        System.out.println("Index of n at Last position: "+ pos1);
        
        //trim() method
        String country1 = "  Bangladesh is my Country   ";
        String s3 = country1.trim();
        System.out.println("Trimmin country1:" + s3);
        
    }
  
}
