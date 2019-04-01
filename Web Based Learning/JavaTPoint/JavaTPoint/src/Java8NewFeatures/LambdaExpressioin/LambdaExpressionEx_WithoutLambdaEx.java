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

//SAM
//functional interface
interface Drawable {
    //SAM
    public void draw();
}

public class LambdaExpressionEx_WithoutLambdaEx {

    public static void main(String[] args) {
        int width = 10;
        //without lambda, Drawable implementation using annonymous class
        Drawable d = new Drawable() { //annoymous class
            //d is the object of that annonymous class
            //but d is not an object of the interface
            @Override
            public void draw() {
                System.out.println("Drawing "+width);
            }
        };
        d.draw();
    }
}
