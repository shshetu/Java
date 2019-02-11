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
public class SynchronizedBlockAnonymous {
    public static void main(String[] args) {
     Print obj = new Print();
     
     //First Thread
     Thread t1;
     t1 = new Thread(){
     @Override
     public void run(){
     obj.printTable(5);
     }
     
     };
     
     ///Second Thread
     Thread t2;
     t2 = new Thread(){
     @Override
     public void run(){
     obj.printTable(100);
     }
     };
     
     //Make the thread runnable
     t1.start();
     t2.start();
    }
}

//creating the method class -> synchronized block
class Print{
void printTable(int n){
synchronized(this){
    for (int i = 1; i < 10; i++) {
        System.out.println(n*i);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
}
}
