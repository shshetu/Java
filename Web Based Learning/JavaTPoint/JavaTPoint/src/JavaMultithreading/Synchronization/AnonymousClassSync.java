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
public class AnonymousClassSync {
    public static void main(String[] args) {
        ///creating anonymous Thread class
        PrintClass obj = new PrintClass();
        
///First Thread
        Thread t1;
        t1 = new Thread(){
 
        @Override
        public void run(){
        obj.printTable(5);
        }
        };
      
//Second Thread
Thread t2;
t2 = new Thread(){

@Override
public void run(){
obj.printTable(100);
}
};
t1.start();
t2.start();
    }
}

//create a class and create printTable method => Synchronized method
class PrintClass{
synchronized void printTable(int n){
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