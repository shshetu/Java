/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_04_01_2019;

/**
 *
 * @author shshe
 */
public class ThreadTest {
    public static void main(String[] args) {
        HelloRunner r = new HelloRunner();
        Thread t1 = new Thread(r); ///Passing runnable object inside Thread consturctor
        t1.setPriority(2); //
        t1.start();
        
        Thread t2 = new Thread(r);
        t2.start();
        System.out.println("t1 Priority: "+ t1.getPriority());
        System.out.println("t2 Priority: "+ t2.getPriority());
        System.out.println("t1 Name: "+ t1.getName());
        System.out.println("t2 Name: "+ t2.getName());
    }
}
