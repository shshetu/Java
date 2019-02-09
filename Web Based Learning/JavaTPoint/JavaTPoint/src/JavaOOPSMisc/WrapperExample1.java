/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOPSMisc;

/**
 *
 * @author User
 */
public class WrapperExample1 {
    public static void main(String[] args) {
        //Convertin int into Integer
        //We use Integer.valuOf(a) for autoboxing
        int a = 20;
        Integer i = Integer.valueOf(a);//converting int into Integer
        Integer j = a; //autoboxing
        System.out.println(a+" "+i+" "+j);
    }
 
}
