/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_04_01_2019;

<<<<<<< HEAD
=======
import java.util.logging.Level;
import java.util.logging.Logger;

>>>>>>> 6ff29930d2050405653fa60123dfcedd430a7b9f
/**
 *
 * @author shshe
 */
public class Ex3 implements Runnable{
    @Override
    public void run(){
<<<<<<< HEAD
        System.out.println("Thread started: "+ Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        e.printStackTrace();
        }
        System.out.println("Thread ended::"+ Thread.currentThread().getName());
    }
}
class ThreadTest{
    public static void main(String[] args) {
      Ex3 r = new Ex3();
      Thread t1 = new Thread(r);
      t1.setPriority(1);
      t1.start();
      
      //
      Thread t2 = new Thread(r);
      t2.start();
        System.out.println("t1 Priority: "+t1.getPriority());
        System.out.println("t2 Priority: "+t2.getPriority());
        System.out.println("t1 Name: "+t1.getName());
        System.out.println("t2 Name: "+t1.getName());
    }
}
=======
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
>>>>>>> 6ff29930d2050405653fa60123dfcedd430a7b9f
