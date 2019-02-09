/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter30;

/**
 *
 * @author User
 */
public class TaskThreadDemo {
    public static void main(String[] args) {
        //Create tasks
      Runnable printA = new PrintChar('a',10);
      Runnable printB = new PrintChar('b',10);
      Runnable print10 = new PrintNum(10);
      
      //Create threads
      Thread thread1 = new Thread(printA);
      Thread thread2 = new Thread(printB);
      Thread thread3 = new Thread(print10);
      
      //Strart threads
      thread1.start();
      thread2.start();
      thread3.start();
    }
}
