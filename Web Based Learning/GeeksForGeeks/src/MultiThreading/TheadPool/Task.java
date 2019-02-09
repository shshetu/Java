/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading.TheadPool;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author shshe
 *///Task class to be executed(step-1)
public class Task implements Runnable{
    private  String name;
    public Task(String s){
    name = s;
    }
    
    //prints task name and sleeps for 1s
    //THis whole process is repeated 5 times
    @Override
    public void run(){
        try {
            for (int i = 0; i <= 5; i++) {
                if (i==0) {
                    Date d = new Date(); //date for d
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Executing Time for task name - "+name+" = "+ft.format(d));
                //prints the execution time for every task
                }
                Thread.sleep(1000);
            }
            System.out.println(name+" complete");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

///Main method in another class
class Testing{
static final int MAX_T = 3;
    public static void main(String[] args) {
        //create five tasks
        Runnable r1 = new Task("task 1");
        Runnable r2 = new Task("task 2");
        Runnable r3 = new Task("task 3");
        Runnable r4 = new Task("task 4");
        Runnable r5 = new Task("task 5");
        //creates a thread pool with MAX_T no of
        //threads as the fixed pool size(step 2)
        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
        
        //passes the Task objects to the poole to execute(step 3)
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);
        
        //pool shutdown(step 4)
        pool.shutdown();
    }

}
