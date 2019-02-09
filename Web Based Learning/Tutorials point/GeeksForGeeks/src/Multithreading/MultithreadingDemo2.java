/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading;

/**
 *
 * @author User
 */
public class MultithreadingDemo2 implements Runnable{
    @Override
    public void run(){
    try{
    //Displaying the thread that is running
        System.out.println("Thread "+ Thread.currentThread().getId()+" is running");
    }catch(Exception e ){
    //Throwig an exception
        System.out.println("Exception is caught");
    
    }
    }
    
}
