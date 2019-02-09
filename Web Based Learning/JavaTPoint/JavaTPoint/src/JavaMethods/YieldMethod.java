/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMethods;

/**
 *
 * @author User
 */
public class YieldMethod extends Thread{
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName()+" in control");
        }
    }
    public static void main(String[] args) {
        YieldMethod t1 = new YieldMethod();
        YieldMethod t2 = new YieldMethod();
        //this will call run() method
        t1.start();
        t2.start();
        for (int i = 0; i < 3; i++) {
            //control passes to child thread
            t1.yield();
            System.out.println(Thread.currentThread().getName()+ " in control");
        }
    }
}
