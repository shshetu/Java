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
public class DaemonThread1 extends Thread{
    @Override
    //our all work will be inside the run method
    public void run(){
        System.out.println("Name: "+ Thread.currentThread().getName());
        System.out.println("Daemon: "+ Thread.currentThread().isDaemon());
    }
    public static void main(String[] args) {
        DaemonThread1 t1 = new DaemonThread1();
        DaemonThread1 t2 = new DaemonThread1();
   t1.setDaemon(true);
        t1.start();
    //t1.setDaemon(true); //will throw an exception here
    t2.start();
    }
}
