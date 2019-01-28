/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavatpointInterviewQuestions;

/**
 *
 * @author User
 */
public class A2 {
    int x= 10; //instance variable
    static int y= 20; //instance variable
    
    A2(){System.out.println("Constructor before static block");}
    static{System.out.println("static block is invoked");}
} 
    class A1{
       public static void main(String[] args) {
         A2 obj = new A2();
        System.out.println(obj.x);
        System.out.println(A2.y);
       
    }
    }

