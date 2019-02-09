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
public class ShutDownHook extends Thread{
    @Override
    public void run(){
        System.out.println("shut down hook task completed...");
    }
    
}
class TestShutDown{

    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new ShutDownHook());
        System.out.println("Now main sleeping...press ctrl+c to exit");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
