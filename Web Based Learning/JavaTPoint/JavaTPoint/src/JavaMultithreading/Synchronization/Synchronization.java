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
public class Synchronization {
    public static void main(String[] args) {
        Table1 obj  = new Table1();
        MyThread11 t1 = new MyThread11(obj);
        MyThread11 t2 = new MyThread11(obj);
        t1.start();
        t2.start();
    }
}
///class that contains the printTable() -> synchronized
class Table1{
synchronized void printTable(int n){
    for (int i = 1; i <=5; i++) {
        System.out.println(n*i);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}

}

//class that contains First Thread
class MyThread11 extends Thread{
Table1 t;
MyThread11(Table1 t){this.t = t;}

    
@Override
public void run(){
t.printTable(5);
} 

}
//class that containes Second Thread
class MyThread22 extends Thread{
Table1 t;
    MyThread22(Table1 t) {
    this.t = t;
    }
@Override
public void run(){
t.printTable(100);
}

}