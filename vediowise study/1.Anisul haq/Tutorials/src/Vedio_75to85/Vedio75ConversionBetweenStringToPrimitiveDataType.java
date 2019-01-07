/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vedio_75to85;

/**
 *s
 * @author shshe
 */
public class Vedio75ConversionBetweenStringToPrimitiveDataType {
    public static void main(String[] args) {
        int i = 100;
        
        //Converting into string Object
        String s = Integer.toString(i);
        System.out.println("s = "+ s); //Here it is a converted String
        
       //Converting double to String
       double d = 100.25;
       String s1 = Double.toString(d);
        System.out.println("DOuble String: " + s1);
        
        //COnverting String to Primitive
        String s2 = "24";
        int j = Integer.parseInt(s2);
        System.out.println("Parsing the String: " + s2);
        
        //COnverting String to DOuble
        String s3 = "35.34";
        double k = Double.parseDouble(s3);
        System.out.println("Parsing Double: "+ k);
        
        //Converting String to integer type using valueOf
        String s4 = "354";
        int a = Integer.valueOf(s4);
        System.out.println("Using valueOf to convert to integer: "+ a);
        
        //Converting String to Double using valueOf
        String s5 = "43.5";
        double b = Double.valueOf(s5);
        System.out.println("Using valueOf to convert to double: "+ b);
    }

}
