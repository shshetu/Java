/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8NewFeatures.MethodReference;

/**
 *
 * @author User
 */
public class MethodReference2 {  
    public static void ThreadStatus(){  
        System.out.println("Thread is running...");  
    }  
    public static void main(String[] args) {  
     Thread t2 = new Thread(MethodReference2::ThreadStatus);
     t2.start();
    } 
}
