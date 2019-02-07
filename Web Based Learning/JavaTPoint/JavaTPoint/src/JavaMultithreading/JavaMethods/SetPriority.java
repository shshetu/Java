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
public class SetPriority extends Thread{
    @Override
    public void run(){
    //run() method is for get method
    
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        
        //creating 2 threads
        SetPriority t1 = new SetPriority();
        SetPriority t2 = new SetPriority();
        SetPriority t3 = new SetPriority();
        SetPriority t4 = new SetPriority();
        SetPriority t5 = new SetPriority();
        SetPriority t6 = new SetPriority();
    
        t1.setPriority(Thread.MIN_PRIORITY);//for minimum priority
    t2.setPriority(Thread.MAX_PRIORITY);//for Max priority
    t3.setPriority(Thread.NORM_PRIORITY);//for Norm priority
    t4.setPriority(8);//for Norm priority
    t5.setPriority(2);//for Norm priority
        try {
    t6.setPriority(12);//no complie time error here but IllegalArgumentException is thrown
        
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    ///invoking the run method()
    //We will focus first on here if there is no default constructor
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    t6.start();
    
    }
}
