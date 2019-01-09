/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookPrograms;

/**
 *
 * @author User
 */
public class Page324_TestSimpleCircle {

    /**
     * @param args the command line arguments
     */
    //Main method
    public static void main(String[] args) {
        //Create a circle with radius 1
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of the circle of radius "+
                circle1.radius+ " is "+ circle1.getArea());
        
        
    }  
}
//Define the circle class with two constructors
class SimpleCircle{
double radius;

//Construct a circle with radius 1
SimpleCircle(){radius = 1;}

//Construct a circle with a specified radius
SimpleCircle(double newRadius){radius = newRadius;}

}
