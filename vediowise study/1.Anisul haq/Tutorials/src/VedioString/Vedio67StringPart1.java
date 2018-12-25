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
public class Vedio67StringPart1 {
    public static void main(String[] args) {
        String s1 = "Shahariar Shetu";
        String s2 = new String("Shahariar Shetu");
        char[] s3 = {'a','b','c','d'};
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("Length of S3 = "+ s3.length);
      ///Value does not match in this matching .Result always not equal
        if(s1 == s2){
            System.out.println("Equal");
        }else{System.out.println("Not equal");}
        
        ///For matching the values
        if(s1.equals(s2)){System.out.println("Equal");}
        else{System.out.println("Not equal");}
        
        //Using contains
        if(s1.contains(s2)){System.out.println("Equal");}
        else{System.out.println("Not equal");}
        
        //Checking wheter shetu is inside
        boolean con = s1.contains("shetu");
        if(con){System.out.println("Contains Shetu");}
        else{System.out.println("Does not contain Shetu");}
        
    //Empty or not
    boolean emp = s1.isEmpty();
    if(emp){System.out.println("Empty");}
    else{System.out.println("Not empty");}
        
    }
  
}
