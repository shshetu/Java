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
public class GetName extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running....");
    }
    public static void main(String[] args) {
        //creating two threads or thread objects
        GetName t1 = new GetName();
        GetName t2 = new GetName();
        //Use of getName() method
        //syntax: public final String getName()
        //stirn must
        System.out.println("t1 name: "+t1.getName());
        System.out.println("t2 name: "+t2.getName());
        t1.start();
        t2.start();
        //why output will first print 2 souts?
        //because main thread will be executed first
        //then the user created threads are made runnable by two threads t1,t2]
        
    }
}
