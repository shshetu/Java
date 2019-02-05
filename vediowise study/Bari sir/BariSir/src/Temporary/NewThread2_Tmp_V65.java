/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temporary;

/**
 *
 * @author shshe
 */
public class NewThread2_Tmp_V65 extends Thread{

    NewThread2_Tmp_V65() {
    super("Demo Thread");
        System.out.println("Child Thread: "+this); //creating object inside constructor of the following class
        this.start(); //starts the threading
        
        //Second entry point
   
    }
     @Override
         public void run(){
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: "+i);
                sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting child thread.");
    
    }
         
    
}
class ExtexdThread{
    
             public static void main(String[] args) {
                 new NewThread2_Tmp_V65(); //creating annonymous object
                 try {
                     for (int i = 5; i > 1; i--) {
                         System.out.println("Main Thread: "+i);
                         Thread.sleep(2000);
                     }
                 } catch (Exception e) {
                     System.out.println("Main Thread Interrupted");
                 }
                 System.out.println("Main Thread exiting");
                 
             }
         }
