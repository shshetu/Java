/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading_Video_65_to_71;


public class ExtendThread_V65 {
    public static void main(String[] args) {
        new NewThread2_V65(); //creating object annonymous
        try{
        for (int i = 5; i > 0; i--) {
            System.out.println("Main Thread: "+ i);
            Thread.sleep(1000);
        }
   }catch(InterruptedException e){
            System.out.println("Main thread interrupted.");
   }
        System.out.println("Main thread exiting.");
    }

    
}
