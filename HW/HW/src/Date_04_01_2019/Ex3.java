/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_04_01_2019;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shshe
 */
public class Ex3 implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread started:::"+ Thread.currentThread().getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
        e.printStackTrace();///prints the throwable exception with class name and line number
        }
        System.out.println("Thread ended:: "+ Thread.currentThread().getName());
    }
}
class TestThreadJoin{
    public static void main(String[] args) {
try{
    Thread t1 = new Thread(new Ex3(),"t1");
    Thread t2 = new Thread(new Ex3(),"t2");
    Thread t3 = new Thread(new Ex3(),"t3");
    t1.start();
///start second thread after waiting for 5 seconds
try{
    t1.join(5000);
}catch(InterruptedException e){
    e.printStackTrace();
}
t2.start();
try {
    t2.join(5000);
} catch (Exception e) {
    e.printStackTrace();
}


//start third thread only when execution before finishing main thread
t3.start();

//let all threads finish execution before finishing main thread
t1.join();
t2.join();
t3.join();
}catch(InterruptedException ex){
            Logger.getLogger(TestThreadJoin.class.getName()).log(Level.SEVERE, null, ex);
}
    }

}