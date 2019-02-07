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
public class Ex4 implements Runnable{
    Thread t;

    public Ex4(String str) {
    t = new Thread(this,str);
    //this will call run() function
    t.start();
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            //yields control to another
        }
        
    }
    
}
