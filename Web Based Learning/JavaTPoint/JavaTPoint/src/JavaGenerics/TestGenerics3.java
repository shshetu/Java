/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaGenerics;

/**
 *
 * @author shshe
 */
public class TestGenerics3 {
    class MyGen<T>{
    T obj;
    void add(T obj)
    }
    public static void main(String[] args) {
        
        MyGen <Integer> m = new MyGen<Integer>();
    }

    
}
