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
 */
public class Test1 implements Runnable{
    private String name;
    public Test1(String s){name = s;}
    @Override
    public void run(){
        try{
        for (int i = 0; i < 5; i++) {
            if (i==0) {
                Date d = new Date();
                SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                System.out.println("Execution time for task name: "+name+" = "+ft.format(d));
                
            }
            Thread.sleep(1000);
        }
            System.out.println(name+" complete");
        }catch(Exception e ){e.printStackTrace();}
    }
}
class Testing1{
static final int MAX_T = 3;
    public static void main(String[] args) {
        Runnable r1 = new Test1("task 1");
        Runnable r2 = new Test1("task 2");
        Runnable r3 = new Test1("task 3");
        Runnable r4 = new Test1("task 4");
        Runnable r5 = new Test1("task 5");
        
        //creates a thread pool
        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
        
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);
        
        pool.shutdown();
    }

}
