/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExceptionHandling.ExceptionPropagation;

/**
 *
 * @author shshe
 */
public class UncheckedExceptionPropagation {
    //method-1
    void m(){
    int data = 50/0;
    }
    //method-2 
    void n(){
    m();
    }
    //method-3
    void p(){
        try {
                 n();
   
        } catch (Exception e) {
            System.out.println("Exception handled!");
        }
    }
    
    public static void main(String[] args) {
        UncheckedExceptionPropagation obj = new UncheckedExceptionPropagation();
        obj.p();
        System.out.println("normal flow..");
    }
  
}
