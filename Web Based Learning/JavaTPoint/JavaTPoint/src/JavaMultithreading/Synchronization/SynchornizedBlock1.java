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
public class SynchornizedBlock1 {
    public static void main(String[] args) {
    SBlockTable obj = new SBlockTable();
    Thread1 t1 = new Thread1(obj);
    Thread2 t2 = new Thread2(obj);
    t1.start();
    t2.start();
    }
    }
///printTable() 
class SBlockTable{
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
//FitstThread
class Thread1 extends Thread{
SBlockTable t;

    public Thread1(SBlockTable t) {this.t = t;
    }
@Override
public void run(){
    t.printTable(5);
}
}

//SecondThread
class Thread2 extends Thread{
SBlockTable t;
public Thread2(SBlockTable t){this.t = t;}
@Override
public void run(){
t.printTable(100);
}
}
