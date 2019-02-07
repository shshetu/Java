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
public class Ex6 {
    int amount = 10000;
    synchronized void withdraw(int amount){
        System.out.println("going to withdraw");
        if (this.amount<amount) {
            System.out.println("Less balance: waiting for deposite....");
            try {
                wait(); //here is a program lock . Waiting for notify()
            } catch (Exception e) {
            }
        }
       this.amount -= amount;
        System.out.println("withdraw completed.....");
    }
    
    ///second synchronized block
    synchronized void deposit(int amount){
        System.out.println("Going to deposite...."+ amount);
        this.amount += amount;
        System.out.println("deposite completed....");
        notify();
    }
}
//main method inside another class
class InterConnectedTest{
    public static void main(String[] args) {
        final Ex6 e = new Ex6();
        ///first anonymous thread
        new Thread(){
        @Override
        public void run(){
        e.withdraw(15000);
        }
        }.start();
        
        //////second anonymous thread
        new Thread(){
        @Override
        public void run(){
        e.deposit(1000);
        }
        
        }.start();
        
        //Third anonymous thread
        new Thread(){
        @Override
        public void run(){
        e.deposit(5000);
        }
        
        }.start();
    }

}
