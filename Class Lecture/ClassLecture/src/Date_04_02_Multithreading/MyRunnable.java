/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_04_02_Multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class MyRunnable implements Runnable{

    @Override
    public void run() {

                 int sum =0;
                try {
                   
                    for (int i = 0; i <= 10; i++) {
                        sum+=i;
                    }
                    System.out.println("Sum :"+sum);
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadAbc.class.getName()).log(Level.SEVERE, null, ex);
               
                }
                                  
                    System.out.println("Sum :"+sum);
    }
    public static void main(String[] args) {
       MyRunnable mr = new MyRunnable();
       Thread t = new Thread(mr);
       t.start();
    }
    
}
