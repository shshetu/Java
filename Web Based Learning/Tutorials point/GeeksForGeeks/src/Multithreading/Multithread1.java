/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading;

/**
 *
 * @author User
 */
public class Multithread1 {
    public static void main(String[] args) {
        int n =8;//Number of threads
        for (int i = 0; i < 8; i++) {
            MultithreadingDemo1 obj = new MultithreadingDemo1();
            obj.start();
        }
    }
}
