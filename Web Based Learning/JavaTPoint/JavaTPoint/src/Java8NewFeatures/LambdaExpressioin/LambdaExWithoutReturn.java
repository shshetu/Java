/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8NewFeatures.LambdaExpressioin;

/**
 *
 * @author shshe
 */
interface Addable2{
int add(int a, int b);
}
public class LambdaExWithoutReturn {
    public static void main(String[] args) {
        //lambda expression without return keyword
        Addable2 add1 = (a,b)->(a+b);
        System.out.println(add1.add(10, 11));;
        
        //lambda expression with return keyword
        Addable2 add2 = (int a,int b)->{
        return a+b;
        };
        //call the method
        System.out.println(add2.add(100, 200));
    }
}
