/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMultithreading.Synchronization;

/**
 *
 * @author shshe
 */


//customer class
class Customer{
int amount = 10000;

///withdraw method
synchronized void withdraw(int amount){
    System.out.println("going to withdraw...");
if(this.amount<amount){
    System.out.println("Less balance;waiting for deposit...");
    try {
        wait();
    } catch (Exception e) {
    }
    this.amount -= amount;
    System.out.println("amount: "+this.amount);
    System.out.println("withdraw completed...");
}
}
///deposit method
synchronized void deposit(int amount){
    System.out.println("Going to deposit...");
    this.amount+= amount;
    System.out.println("deposit completed...");
    notify();
}

}

//Main calss
public class InterThreadCommunication {
    public static void main(String[] args) {
        final Customer c = new Customer();
        ///1st annonymous class with anonymous thread
        new Thread(){
        @Override
        public void run(){c.withdraw(15000);}
        }.start();
        
        //2nd anonymous class with anonymous thread
        new Thread(){
        @Override
        public void run(){c.deposit(10000);}
        }.start();
    }
}

