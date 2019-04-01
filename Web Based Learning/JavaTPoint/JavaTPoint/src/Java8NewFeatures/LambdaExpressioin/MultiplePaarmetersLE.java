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
//interface
interface Addable{
    //100% abstraction no body
public int add(int a, int b);
}

public class MultiplePaarmetersLE {
    public static void main(String[] args) {
        Addable ad1 = (a,b)->{
        return a+b;
        };
        //call the method
        //must add the sout because it is int type and will return int
        System.out.println(ad1.add(5, 6));
        
        ///we can also use multiple parameter with data type
        Addable add2 = (int a,int b)->{
        return a+b;
        };
        System.out.println(add2.add(100, 200));
    }
}
