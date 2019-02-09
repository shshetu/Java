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
public class CurrentThreadExp extends Thread{
    //print currently executing thread
  //run mehtod is a must since we hava already inherited the Thread class
    public void run(){
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()); //since currentThread() is static type so class name is added earlier
    }
    //creating the main method which is also a main thread
    public static void main(String[] args) {
        CurrentThreadExp t1  = new CurrentThreadExp();
        CurrentThreadExp t2  = new CurrentThreadExp();
        
        ///start() will call the run() method and the thread is in running state
        t1.start();
        t2.start();
    }
}
