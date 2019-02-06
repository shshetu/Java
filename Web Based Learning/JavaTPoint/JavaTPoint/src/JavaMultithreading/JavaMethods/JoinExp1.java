/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMultithreading.JavaMethods;

/**
 *
 * @author shshe
 */
public class JoinExp1 extends Thread{
   //run() is must for a Thread class
    @Override
    public void run(){
    ///We just print a loop most of the time to understand
        for (int i = 1; i < 10; i++) {
            try {
              Thread.sleep(500);  
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(""+i);
            
        }
    }
    //creating main() method
    public static void main(String[] args) {
        JoinExp1 t1 = new JoinExp1();
        JoinExp1 t2 = new JoinExp1();
        JoinExp1 t3 = new JoinExp1();
        //making a thread running 
        t1.start();
        //using join() method
        //we have to uss try catch for join()
        ///There 3 types of join method
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}
