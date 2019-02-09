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
public class SingleTask implements Runnable{
    @Override
    public void run(){
        System.out.println("Single Task");
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new SingleTask());
        Thread t2 = new Thread(new SingleTask());
   t1.start();
   t2.start();
    }
}
