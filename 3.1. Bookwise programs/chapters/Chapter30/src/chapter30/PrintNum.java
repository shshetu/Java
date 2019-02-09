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
public class PrintNum implements Runnable{
    private int lastNum;
    /*Construct a task for printing 1,2,..... n*/
    public PrintNum(int n){
    lastNum = n;
    }
    @Override
    public void run(){
        for (int i = 0; i <= lastNum; i++) {
            System.out.print(" "+i);
        }
    }
}
