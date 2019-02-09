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
public class WrapperExample2 {
    public static void main(String[] args) {
        //Converting Integer into int
        //We use a.intValue() for unboxing explicitly
        Integer a = new Integer(3);
        int i = a.intValue(); ///converting Integer to int
        int j = a; //Unboxing,now complier will write a.intValue() internally
    }
}
