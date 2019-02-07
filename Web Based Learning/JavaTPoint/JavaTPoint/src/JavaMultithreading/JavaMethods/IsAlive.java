/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMultithreading.JavaMethods;

/**
 *
 * @author shshe
 */
public class IsAlive extends Thread{
    @Override
    public void run(){
        try {
            Thread.sleep(3000);
            System.out.println("is run() method isAlive: "+ Thread.currentThread().isAlive());

        } catch (InterruptedException e) {
            System.out.println(e);  
        }
   
        
    }
    public static void main(String[] args) {
        IsAlive t1 = new IsAlive();
        System.out.println("Before starting: "+ t1.isAlive());
        t1.start();
        System.out.println("After starting: "+ t1.isAlive());
        
    }
}
