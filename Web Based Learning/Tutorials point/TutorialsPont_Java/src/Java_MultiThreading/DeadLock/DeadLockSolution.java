/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_MultiThreading.DeadLock;

/**
 *
 * @author shshe
 */
public class DeadLockSolution {
    //creating 2 objects
    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();
    public static void main(String[] args) {
       ThreadDemo1 t1 = new ThreadDemo1();
       ThreadDemo2 t2 = new ThreadDemo2();
       t1.start();
       t2.start();
    }
}
 
//Thread class one
class ThreadDemo1 extends Thread{
@Override
public void run(){
synchronized(DeadLockSolution.Lock1){
    System.out.println("Thread 1: Holding lock 1...");
    try {
        Thread.sleep(100);
    } catch (Exception e) {
        e.printStackTrace();
    }
    System.out.println("Thread 1: Waiting for lock 2");
synchronized(DeadLockSolution.Lock2){
    System.out.println("Thread 1: Holding lock 1 & 2");
}
}
}
}

//Thread class two
class ThreadDemo2 extends Thread{
@Override
public void run(){
synchronized(DeadLockSolution.Lock1){
    System.out.println("Thread 2: Holding Lock 1...");
}
    try {
        Thread.sleep(1000);
    } catch (Exception e) {
      e.printStackTrace();
    }
      System.out.println("Thread 2: Waiting for Lock 2....");
    synchronized(DeadLockSolution.Lock2){
        System.out.println("Thread 2: Holding Lock 1 & 2...");
    }
}
}








