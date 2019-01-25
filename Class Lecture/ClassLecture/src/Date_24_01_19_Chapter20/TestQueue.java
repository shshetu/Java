/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_24_01_19_Chapter20;

/**
 *
 * @author User
 */
public class TestQueue {
    public static void main(String[] args) {
        java.util.Queue<String> queue  = new java.util.LinkedList<>();
        queue.offer("Oklahoma");
        queue.offer("Indiana");
        queue.offer("Georgia");
        queue.offer("Texas");
        
        while(queue.size()>0){
            System.out.println(queue.remove()+" ");
        }
    }
}
