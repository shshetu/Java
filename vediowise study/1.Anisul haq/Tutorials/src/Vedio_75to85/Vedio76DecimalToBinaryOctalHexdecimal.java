/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vedio_75to85;

/**
 *
 * @author shshe
 */
public class Vedio76DecimalToBinaryOctalHexdecimal {
    public static void main(String[] args) {
        //COnverting binary to decimal using Wraapper
      String binary = "1010";
      Integer decimal = Integer.parseInt(binary,2); 
        System.out.println("Converting "+binary+" to decimal: "+ decimal);
    
        //Converting Octal to Decmal using Integer and parseInt() wrapper class
    String octal = "643";
Integer decimal1 = Integer.parseInt(octal,8);
        System.out.println("Converting "+ octal + " to decimal: "+ decimal1);
    //COnverting hexadecimal to Binary
    String hexadecimal = "A";
    Integer decimal2 = Integer.parseInt(hexadecimal,16);
        System.out.println("Converting "+ hexadecimal + " to binray: "+ decimal2);
        
        //attempt:1(COnverting binary,octal,hexadecimal to decimal)
        String bin = "1010";
        String oct = "2554";
        String hexa = "9AB";
        Integer bintodec = Integer.parseInt(bin,2);
        Integer octtodec = Integer.parseInt(oct,8);
        Integer hexatodec = Integer.parseInt(hexa,16);
        System.out.println("Binary: "+ bin + " to decimal: "+ bintodec);
        System.out.println("Octal: "+ oct + " to decimal: "+ octtodec);
        System.out.println("Hexdecimal: "+ hexa + " to decimal: "+ hexatodec);
    
    }
}
