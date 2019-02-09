/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMultithreading.MultiTasking;
 
        ///still multitasking though we did not extend
public class MultiTaskingAnonymousClass {
    public static void main(String[] args) {
        Thread t1;
        t1 = new Thread(){
            @Override
            public void run(){
                System.out.println("Task one");
            }
            
        };
        
        Thread t2;
        t2 = new Thread(){
        @Override
        public void run(){
            System.out.println("Task two");
        }
        };
        t1.start();
        t2.start();
    }
}
