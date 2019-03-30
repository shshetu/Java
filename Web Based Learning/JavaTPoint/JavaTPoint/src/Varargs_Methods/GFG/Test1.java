/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Varargs_Methods.GFG;

/**
 *
 * @author shshe
 */
public class Test1 {

    static void fun(int... a) {
        System.out.println("Number of arguments: " + a.length);
        //using for each loop to display contents of a 
        for (int x : a) {
            System.out.println(x + " ");

        }
    }
//Driver code
    public static void main(String[] args) {
        //calling the varargs method with different number of parameters
        fun(100);
        fun(1,2,3,4);
        fun();
    }
}
