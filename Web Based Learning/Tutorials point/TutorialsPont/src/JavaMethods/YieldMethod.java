/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMethods;

/**
 *
 * @author shshe
 */
public class YieldMethod implements Runnable{
    Thread t;
    YieldMethod(String str){
    t = new Thread(this,str); //runnable object is passed 
    //this will call run() function
    t.start();
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            //yields control to anotherthread every 5 iterations
            if(i%5 ==0){
                System.out.println(Thread.currentThread().getName()+" yielding control");
            }
            //caused the currently executing thread object to temoporarily pause and allow other threads to execute
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName()+"has finished executing");
    }
    public static void main(String[] args) {
        new YieldMethod("Thread 1");
        new YieldMethod("Thread 2");
        new YieldMethod("Thread 3");
        
    }
}
