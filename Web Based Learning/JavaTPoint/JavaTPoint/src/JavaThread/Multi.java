/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaThread;

/**
 *
 * @author User
 */
//1st way
public class Multi extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running.....");
    }
    public static void main(String[] args) {
        Multi ma = new Multi();
        //ma.start(); ///working as a thread
       // ma.start(); ///working as a thread
        new Multi().start();
        new Multi().start();
//        ma.run();//Working as normal object
//        ma.run();//Working as normal object
//        ma.run();//Working as normal object
//    
    
}
}  
//2nd way

