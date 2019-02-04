/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_04_02_Multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
1. Runnable interface 
2. Thread class
3. annnonymous class from Runnable interface

 */
public class WayOfCreatingThread implements Runnable{
int sum = 0;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            sum+=i;
        }
        System.out.println("Sum: "+ sum);
    try {
        Thread.sleep(5000);
    } catch (InterruptedException ex) {
        Logger.getLogger(WayOfCreatingThread.class.getName()).log(Level.SEVERE, null, ex);
    }
        System.out.println("Sum: "+ sum);
    }
    
    public static void main(String[] args) {
        //FirstWay f = new WayOfCreatingThread();
        SecondWay s = new SecondWay();
        // More Dynamic way usingn annonymous object
        Thread t = new Thread(new WayOfCreatingThread());
        t.start();
        //s.start();
        
        ///Third Way: passing the annonymous object from runnable interface with annonymous class
        Thread thirdWay = new Thread(new Runnable() {
            @Override
            public void run() {
           int sum = 0; 
        for (int i = 0; i < 10; i++) {
            sum+=i;
        }
        System.out.println("Sum: "+ sum);
    try {
        Thread.sleep(5000);
    } catch (InterruptedException ex) {
        Logger.getLogger(WayOfCreatingThread.class.getName()).log(Level.SEVERE, null, ex);
    }
        System.out.println("Sum: "+ sum);
        
            }
        });
        
   //  thirdWay.start();
    }
    
}
class SecondWay extends Thread{
int sum = 0;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            sum+=i;
        }
        System.out.println("Sum: "+ sum);
    try {
        Thread.sleep(5000);
    } catch (InterruptedException ex) {
        Logger.getLogger(WayOfCreatingThread.class.getName()).log(Level.SEVERE, null, ex);
    }
        System.out.println("Sum: "+ sum);
    }

}

