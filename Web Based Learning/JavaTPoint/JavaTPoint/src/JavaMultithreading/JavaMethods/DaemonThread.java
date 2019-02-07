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
public class DaemonThread extends Thread{
    @Override
    public void run(){
    if(Thread.currentThread().isDaemon()){
        System.out.println("Deamon Thread works");
    }else{
        System.out.println("User thread works");
    }
    }
    ///main method 
    public static void main(String[] args) {
        DaemonThread t1 = new DaemonThread();
        DaemonThread t2 = new DaemonThread();
        DaemonThread t3 = new DaemonThread();
        
        ///set Daemon
        t1.setDaemon(true); //must boolean value will be occupied
        t1.start();
        t2.start();
        t3.start();
        
    }
}
