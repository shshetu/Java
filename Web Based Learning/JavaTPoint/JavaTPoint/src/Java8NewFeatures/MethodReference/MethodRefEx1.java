/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8NewFeatures.MethodReference;

/**
 *
 * @author User
 */
//We use lambda expression concept so we need one interface and a class
interface Sayable {

    void say();
}

public class MethodRefEx1 {

    //static method
    public static void saySomeThing() {
        System.out.println("Hello, this is static method.");
    }

    public static void main(String[] args) {
        //using lambda expression
        Sayable sayable = () -> {
            System.out.println("Hi i am shetu!");
        };

        sayable.say();
        
        //Referering static method
        Sayable sayable1 = MethodRefEx1::saySomeThing;

        //Calling interface method
        sayable1.say();
    }

}
