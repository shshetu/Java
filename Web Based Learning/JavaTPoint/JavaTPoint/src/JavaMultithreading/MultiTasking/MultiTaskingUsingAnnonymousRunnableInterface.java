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
public class MultiTaskingUsingAnnonymousRunnableInterface {
    public static void main(String[] args) {
        Runnable r1;
        r1 = new Runnable(){
            @Override
            public void run(){
                System.out.println("Task one");    
            }
        };
        Runnable r2;
        r2 = new Runnable(){
            @Override
            public void run(){
                System.out.println("Task two");
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
