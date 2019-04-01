/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8NewFeatures.MethodReference;

import java.util.function.BiFunction;

/**
 *
 * @author User
 */
//we must have atleast 2 classes
class Arithmetic {
    
    
    //static method name
    public static int add(int a, int b) {
        return a + b;
    }
}

public class MethdoRef3 {
    public static void main(String[] args) {
        //ClassName:: static method name
        BiFunction<Integer,Integer,Integer> adder = Arithmetic::add;
        int result = adder.apply(10, 20); //a method is containing the add() method
        System.out.println(result);
    }
}
