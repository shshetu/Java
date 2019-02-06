/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading_Video_65_to_71;

/**
 *
 * @author shshe
 */
public class NewThread2_V65 extends Thread{
    NewThread2_V65(){
    //create a new , second thread
    super("Demo Thread");
        System.out.println("Child Thread: "+ this); //this is the object of this subclass
        this.start(); //start the thread using this object
    }
    //This is the entry point for the second thread.
    @Override
    public void run(){
    try{
        for (int i = 5; i > 0; i--) {
            System.out.println("Child Thread: "+i);
            sleep(500);
        }
    }catch(InterruptedException e){
        System.out.println("Child Interrupted.");
    }
        System.out.println("Exiting child thread.");
    }
}
