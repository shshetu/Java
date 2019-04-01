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
class Arithmetic1 {
    //static int type

    public static int add(int a, int b) {
        return a + b;
    }
    //static int type

    public static float add(int a, float b) {
        return a + b;
    }
    //static int type

    public static float add(float a, float b) {
        return a + b;
    }
}

public class MethodRef4 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> adder1 = Arithmetic::add;
        BiFunction<Integer,Float,Float> adder2 = Arithmetic::add;
        
    }
}
