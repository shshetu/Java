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
public class GetPriority extends  Thread{
    //overriding the run method is a must
    @Override
    public void run(){
        System.out.println("Running thread name: "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        //createing two threads
        GetPriority t1  = new GetPriority();
        GetPriority t2 = new GetPriority();
        System.out.println("t1 thread priority: "+ t1.getPriority());
        System.out.println("t2 thread priority: "+ t2.getPriority());
        t1.start();
        t2.start();
        
    }
}
