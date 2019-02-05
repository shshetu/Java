/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_04_01_2019;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shshe
 */
public class HelloRunner implements Runnable{ //Implementing Runnable Interface 
    int i; //instance Variable declaration not initialization

    @Override
    public void run() { //Overriding the run method for threading
        i =0; //initialization
        while (true) {            
            try {
                System.out.println("Hello: "+ i++);
                if (i == 10) {
                    break;
                }
                Thread.sleep(3000);//3 Seconds  2 exception will be handelled
                //for Thread.sleep() 1. for negative milli 2.for executiaon 
            } catch (InterruptedException ex) {
                Logger.getLogger(HelloRunner.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
