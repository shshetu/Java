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
public class CurrentThreadMethod extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        //create two thread
        CurrentThreadMethod t1 = new CurrentThreadMethod();
       CurrentThreadMethod t2 = new CurrentThreadMethod();
       ///////
       t1.start();
       
    }
}
