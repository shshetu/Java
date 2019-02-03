/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultithredingInJava;

/**
 *
 * @author User
 */
public class TestCallRun1 extends Thread {
    @Override
    public void run(){
        System.out.println("running....");
    }
    public static void main(String[] args) {
        TestCallRun1 t1 = new TestCallRun1();
        t1.run(); //run method from main thread, the run() method goes
        //onto the current call stack rather than at the beginning of a new
        //call stack
       //t1.start();
    }
}
