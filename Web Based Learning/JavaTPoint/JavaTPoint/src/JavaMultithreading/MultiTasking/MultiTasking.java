/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMultithreading.MultiTasking;

/**
 *
 * @author shshe
 */
public class MultiTasking{
    public static void main(String[] args) {
    Thread t1 = new Thread(new SimpleTask1());
    Thread t2 = new Thread(new SimpleTask2());
    t1.start();
    t2.start();
    }
}
class SimpleTask1 implements Runnable{
@Override
public void run(){
    for (int i = 0; i < 3; i++) {
        System.out.println("Task one!"); 
    }
   
}
}

class SimpleTask2 implements Runnable{
@Override
public void run(){
   for (int i = 0; i < 3; i++) {
        System.out.println("Task two!"); 
    }
}
}
