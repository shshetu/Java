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
public class YieldExp extends Thread{
 @Override
 public void run(){
     for (int i = 0; i < 5; i++) {
         System.out.println(Thread.currentThread().getName()+" in control");

        }
 }   
    public static void main(String[] args) {
        YieldExp t1 = new YieldExp();
        YieldExp t2 = new YieldExp();
        //two works are done concurrently
        t1.start();
        t2.start();
        
        //second for loop
        //current thread is the main thread
        for (int i = 0; i < 5; i++) {
            t1.yield();
            System.out.println(Thread.currentThread().getName()+" in control");
        }
    }
}
