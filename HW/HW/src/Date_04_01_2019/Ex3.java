/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_04_01_2019;

/**
 *
 * @author shshe
 */
public class Ex3 implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread started: "+ Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        e.printStackTrace();
        }
        System.out.println("Thread ended::"+ Thread.currentThread().getName());
    }
}
class ThreadTest{
    public static void main(String[] args) {
      Ex3 r = new Ex3();
      Thread t1 = new Thread(r);
      t1.setPriority(1);
      t1.start();
      
      //
      Thread t2 = new Thread(r);
      t2.start();
        System.out.println("t1 Priority: "+t1.getPriority());
        System.out.println("t2 Priority: "+t2.getPriority());
        System.out.println("t1 Name: "+t1.getName());
        System.out.println("t2 Name: "+t1.getName());
    }
}
