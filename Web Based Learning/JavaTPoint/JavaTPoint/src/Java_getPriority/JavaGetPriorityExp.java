/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_getPriority;

/**
 *
 * @author shshe
 */
public class JavaGetPriorityExp extends Thread{
  
    @Override
        public void run(){
        System.out.println("running Thread name is: "+ Thread.currentThread().getName());
        }
        public static void main(String[] args) {
        //creating two threads
        JavaGetPriorityExp t1 = new JavaGetPriorityExp();
        JavaGetPriorityExp t2 = new JavaGetPriorityExp();
        
        //print the edefault priority value of thread
            System.out.println("t1 thread priority: "+ t1.getPriority());
            System.out.println("t2 thread priority: "+ t2.getPriority());
            
            ///this will call the run() method
            t1.start();
            t2.start();
    }
    
}   

