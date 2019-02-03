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
public class MultithreadingDemo1 extends Thread{
    @Override
    public void run(){
    try{
    //Displaying the tread that is running
        System.out.println("Thread "+ Thread.currentThread().getId()+" is running");
    }catch(Exception e){
        System.out.println("Exception is caught!");}
    }
    //Main class
  
}
  
