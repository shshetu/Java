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
public class TestCallRun2 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            try{Thread.sleep(500);}
            catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        TestCallRun2 t1 = new TestCallRun2();
        TestCallRun2 t2 = new TestCallRun2();
        ///t1 and t2 are treated as normal object not the threaded object
        t1.run();
        t2.run();
        //t1.start();
       //t2.start();
    }
}
