/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadPriorityInMultithreading;

/**
 *
 * @author shshe
 */
public class ThreadDemo extends Thread{
@Override
public void run(){
    System.out.println("Inside run method");
}
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo t2 = new ThreadDemo();
        ThreadDemo t3 = new ThreadDemo();
//        t1.start();
        //printing thread priority
        System.out.println("r1 thread priority: "+ t1.getPriority());//default 5
        System.out.println("r2 thread priority: "+ t2.getPriority());//default 5
        System.out.println("r3 thread priority: "+ t3.getPriority());//default 5
        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);
        
        //t3.setPriority will throw illegalArgumentException
        System.out.println("t1 thread priority: "+ t1.getPriority()); //2
        System.out.println("t2 thread priority: "+ t2.getPriority()); //5
        System.out.println("t3 thread priority: "+ t3.getPriority()); //8
        
        //Main thread
        System.out.println(Thread.currentThread().getName());
        System.out.println("Main thread priority: "+ Thread.currentThread().getPriority());
        
        //Mina thread priority is set to 10
        Thread.currentThread().setPriority(10);
        System.out.println("Main thread priority: "+ Thread.currentThread().getPriority());
    
    }
    
}
