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
    public static void main(String[] args) {
        
    }
    //Define the circle with two constructors
    class SimpleCircle{
    double radius;
    
//Construct a circle with radius 1
    SimpleCircle(){radius = 1;}
    
    //Construct a circle with a specified radius
    SimpleCircle(double newRadius){radius = newRadius;}
    
    //Return the area of this circle
    double getArea(){return radius*radius*Math.PI};
    
    }
    
}
