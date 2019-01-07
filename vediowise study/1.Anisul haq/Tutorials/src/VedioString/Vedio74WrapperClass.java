/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VedioString;

/**
 *
 * @author shshe
 */
public class Vedio74WrapperClass {
    public static void main(String[] args) {
      
        //Primitive to Object 
        int x = 30; 
     Integer y = Integer.valueOf(x);
        System.out.println("y= " +y);
        
        //Directly Primitve to Object = Autoboxing 
     Integer z = x;
        System.out.println("z= " +z);
        
        //Object to Primitive 
        Double d = new Double(10.25);
        System.out.println("d = " + d);
        double e = d.doubleValue();
        System.out.println("e = " + e);
        
        //Unboxing
        double f = d;
        System.out.println("f = "+ f);
        
    }
}
