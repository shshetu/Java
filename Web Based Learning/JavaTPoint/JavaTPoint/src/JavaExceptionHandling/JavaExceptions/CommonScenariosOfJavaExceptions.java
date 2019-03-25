/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExceptionHandling.JavaExceptions;

/**
 *
 * @author shshe
 */
public class CommonScenariosOfJavaExceptions {
    public static void main(String[] args) {
        
        //1.ArithmeticException
        try {
            int a= 10/0;
        } catch (ArithmeticException e) {
        e.printStackTrace();
        }
        finally{System.out.println("ArithmaticException!");}
        
        //2.NullPointerException
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
        e.printStackTrace();
        }
        finally{System.out.println("NullPointerException!");}

        //3.NumberFormatException
        try {
            String s = "abc";
            int i = Integer.parseInt(s);
        } catch (NumberFormatException e) {
        e.printStackTrace();
        }
        finally{System.out.println("NumberFormatException!");}
        
        //4.ArrayIndexOutOfBoundsException
        try {
           int[] a = new int[5];
        a[10] = 50; 
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        finally{System.out.println("ArrayIndexOutOfBoundsException!");}
        
    }
}
