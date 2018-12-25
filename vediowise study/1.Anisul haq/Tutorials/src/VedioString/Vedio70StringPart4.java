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
public class Vedio70StringPart4 {
    public static void main(String[] args) {
        String s1 = "This is my country";
        //replace() method
        String s2 = s1.replace('i','j');   //inputs character
        System.out.println(""+ s2);
        
        //split() method splitting with respect to space
        String[] s3 = s1.split(" ");
        for(String x: s3){System.out.print(""+x); }
        
        //split() method : splitting with repect to underscore(_)
        String str = "This_is_my country";
        String[] str1 = str.split("_"); //split type will always stores in an Array
        for(String y:str1){System.out.println(y);}
    }
  
}
