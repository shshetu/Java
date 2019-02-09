/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaConcurrency;

/** 
 *
 * @author User
 */
//My thread extending Thread
public class MyThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+ " in control");
            
            
        }
    }
}
class yieldDemo{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        for (int i = 0; i < 5; i++) {
            //control passes to child thread
            Thread.yield();
            //After execution of child Thread
            //main thread takes over
            System.out.println(Thread.currentThread().getName()+" in control");
        }
    }
}
