/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_04_02_Multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Customer {
   int amount = 10000;
   synchronized void withdraw(int amount){
       System.out.println("Going to withdraw...");
       if (this.amount<amount) {
           try {
               wait();
           } catch (InterruptedException ex) {
               Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       
   }
}
