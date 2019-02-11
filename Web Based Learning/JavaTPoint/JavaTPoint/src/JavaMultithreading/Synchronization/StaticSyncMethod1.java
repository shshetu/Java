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

//Main method class/ main thread class
public class StaticSyncMethod1 {
    public static void main(String[] args) {
   FirstThread t1 = new FirstThread();
   SecondThread t2 = new SecondThread();
   ThirdThread t3 = new ThirdThread();
   FourthThread t4 = new FourthThread();
   t1.start();
   t2.start();
   t3.start();
   t4.start();
    }
}

//Table print Thread
class Table11{
synchronized static void printTable(int n){
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

///First Thread
class FirstThread extends Thread{
@Override
public void run(){
Table11.printTable(1);
}
}


//Second Thread
class SecondThread extends Thread{
@Override
public void run(){
Table11.printTable(10);
}
}
//Third Thread
class ThirdThread extends Thread{
    @Override
    public void run(){
    Table11.printTable(100);
    }
}

//Fourth Thread
class FourthThread extends Thread{
@Override
public void run(){
Table11.printTable(1000);
}
}
