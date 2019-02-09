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
public class PrintChar implements Runnable{
    private char charToPrint; //The character to print
    private int times; //The number of times to repeat
    
    public PrintChar(char c,int t){
    charToPrint = c;
    times = t;
    }
    @Override
    public void run(){
        for (int i = 0; i < times; i++) {
            System.out.print(" "+charToPrint);
        }
    }
}
