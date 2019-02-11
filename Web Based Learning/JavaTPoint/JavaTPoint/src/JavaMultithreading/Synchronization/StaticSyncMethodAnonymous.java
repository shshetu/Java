/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMultithreading.Synchronization;

/**
 *
 * @author shshe
 */
//Main method
public class StaticSyncMethodAnonymous {
    public static void main(String[] args) {
    
       //First anonymous class thread
        Thread t1;
        t1 = new Thread(){
       @Override
       public void run(){
       StaticPrint.printTable(1);
       }
        };
        
        ///Second anonymous class thread
        Thread t2;
        t2 = new Thread(){
        @Override
        public void run(){
        StaticPrint.printTable(10);
        }
        };
        
        //Third Annonymous class Thread
         Thread t3;
        t3 = new Thread(){
        @Override
        public void run(){
        StaticPrint.printTable(100);
        }
        };
        
        //Fourth Anonymous class Thread
         Thread t4;
        t4 = new Thread(){
        @Override
        public void run(){
        StaticPrint.printTable(105);
        }
        };
        ///Making the threads runnable
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

///printTable class => static synchronized method containing
class StaticPrint{
synchronized static void printTable(int n){
    for (int i = 1; i < 10; i++) {
        System.out.println(n*i);
        try {
           // Thread.sleep(500);
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
}
