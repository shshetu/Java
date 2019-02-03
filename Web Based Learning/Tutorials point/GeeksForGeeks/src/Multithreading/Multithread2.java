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
public class Multithread2 {
    public static void main(String[] args) {
        int n = 8;//Number of threads
        for (int i = 0; i < 8; i++) {
            Thread object = new Thread(new MultithreadingDemo2());
            object.start();
        }
    }
}
