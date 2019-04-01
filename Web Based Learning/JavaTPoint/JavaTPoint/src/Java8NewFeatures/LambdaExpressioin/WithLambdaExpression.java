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
//creating a Drawable1 interface
interface Drawable1 {

    void draw();
}

public class WithLambdaExpression {

    public static void main(String[] args) {
        int width = 10;

        //with lambda expression
        Drawable1 d2 = () -> {
            System.out.println("Drawing " + width);
        };
        //must call the draw method of the interface
        d2.draw();
    }

}
