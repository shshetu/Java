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
interface Sayable {

    public String say();
}

public class NoParameterLE {

    public static void main(String[] args) {
//    int width = 20;
Sayable s = ()->{
   return "I have nothing to say.";
};
        System.out.println(s.say());
    }
}
