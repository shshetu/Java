/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExceptions;

/**
 *
 * @author User
 */
public class JavaExceptionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ArithmeticException: ");
        try{
    int data = 100/0; //ArithmeticException
        }catch(ArithmeticException e1){
    
            System.out.println("Arithmetic: "+ e1);
    }
    ///NullPointerException = If any variable has null values and wee do operation with it
    String s = null;
    try{
        System.out.println(s.length()); //NullPointerException
    }catch(NullPointerException e2){
        
        System.out.println(e2);
    }
   
///NumberFormatException = Wrong Formatting of any value
String s1 = "abc";
try{
int i = Integer.parseInt(s1); //NumberFormatException
}catch(NumberFormatException e3){
    System.out.println(e3);
}
    //ArrayIndexOutOfBoundsException = inserting value on wrong index
    
    int[] a = new int[5];
    try{
    a[30] = 30; //ArrayIndexOutOfBoundsException
    }catch(ArrayIndexOutOfBoundsException e4){
        System.out.println(e4);
    }
    
    
    
    }
    
    
    }
