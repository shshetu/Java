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
public class Vedio73StringBuilder {
    public static void main(String[] args) {
//StringBuilder
StringBuilder str = new StringBuilder("Shahariar");
        System.out.println(str);
        
//append()
str.append(" Shetu");
str.append(" 23");
str.append(" 12.3");
        System.out.println(str);

//reverse()  ///kono dorkar nai etake variable er moddhe nea
str.reverse();
        System.out.println(str);
        
        //delete(2,5)
        str.delete(2,5);
        System.out.println(str);
    }
  
}
