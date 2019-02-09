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

    public YieldMethod(String str) {
        t = new Thread(this,str);
        //this will call run() function
       t.start();
    }
    public void run(){
        for (int i = 0; i < 5; i++) {
            //yields contro to another thread every 5 iterations
            if(i%5 == 0){
                System.out.println(Thread.currentThread().getName()+" yielding control....");
            }
            /*causes the currently executing thread object to temporarily 
            pause and allow other threads to execute*/
            Thread.yield();
        }
    }
    
}
