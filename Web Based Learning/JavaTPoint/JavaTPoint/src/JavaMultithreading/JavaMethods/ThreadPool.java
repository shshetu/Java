/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMultithreading.JavaMethods;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author shshe
 */
//implementing Runnable interface
public class ThreadPool implements Runnable{
    //declaring fields
    private String message;
    
    //declaring parameterized constructor 
    public ThreadPool(String s){this.message = s;}
    
    //Overriding the run method
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+" (start) message= "+ message); 
    processmessage();
        System.out.println(Thread.currentThread().getName()+" (end)");
    }
    
    private void processmessage(){
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//creating the test class
class TestThreadPool{
    public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(5); //fixed thread pool boss
        for (int i = 0; i < 10; i++) {
            Runnable worker = new ThreadPool(" "+i);
            executor.execute(worker); //calling execute method of executorService
            
        }
        executor.shutdown(); //shutting down the thread pool
            
            //while loop
            while(!executor.isTerminated()){}
                System.out.println("Finished all threads");
            
    }

}
