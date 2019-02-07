/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMultithreading.JavaMethods;

/**
 *
 * @author shshe
 */
public class SetName extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running//////");
    }
    public static void main(String[] args) {
        SetName t1 = new SetName();
        SetName t2 = new SetName();
            System.out.println("t1: "+t1.getName());
        System.out.println("t1: "+t2.getName());
        t1.setName("shetu");
        t2.setName("shanta");
        
    
        
        t1.start();
        t2.start();
            System.out.println("t1: "+t1.getName());
        System.out.println("t1: "+t2.getName());
        
    }
}
