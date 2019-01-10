/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTypes;

/**
 *
 * @author User
 */
public class DataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    byte myByte = 12; //1 byte = 8 bit => -128 to 127
    boolean myBool = true; //
        short myShort = 2; //2 bytes = 16 bit => -2^16 to 2^16 -1
        char myChar = 'A'; //2 bytes = 16 bit 
        int myInt = 5; //4 bytes = 32 bit => -2^32 to 2^32 -1
    float myFloat = 35e30f; //4 bytes = 32 bit => 3.4e-038 to 3.4e+038
    long myLong = 2_147_483_6475L ; //8 bytes = 64 bit => -2^64 to 2^64 -1
    double myDouble = 1.7e308; //8 bytes => 1.7e-308 to 1.7e+308
  ///
  
 
//Printing the result:
System.out.println("myByte: "+ myByte);
        System.out.println("myBool: "+ myBool);
        System.out.println("`mShort: "+ myShort);
        System.out.println("myInt: "+ myInt);
        System.out.println("myFloat: "+ myFloat);
        System.out.println("myLong: "+ myLong);
        System.out.println("myDouble: "+ myDouble);
        System.out.println("myChar: "+ myChar);
        System.out.println("division: "+ (22.0/7.0));
        
        ////
        int x = 5;
        x = x&3;
        System.out.println("x:" + x);
        
//
String txt1 = "It's alright! ";
String txt2 = "That's great!";
String txt3 = txt1 + txt2;
        System.out.println(" "+ txt3);
        System.out.println("String Length: "+ txt3.length());
        System.out.println("UpperCase: " + txt3.toUpperCase());
        System.out.println("UpperCase: " + txt3.toLowerCase());
        System.out.println("Index of S: "+ txt3.indexOf("s"));
        System.out.println("Index of S: "+ txt3.lastIndexOf("s"));
        System.out.println("String concat : "+ txt1.concat(txt2));
        

    }
    
}
