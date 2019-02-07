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
public class NotifyMethod extends Thread{
    @Override
    public void run(){
    synchronized(this){
        System.out.println("starting of ");
    
    }
    }
}
