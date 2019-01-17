/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_17_01_2019_Chapter13;

/**
 *
 * @author User
 */
public class CircleFromSimpleGeometricObject extends GeometricObject {
private double radius; //Encapsulation, declaration

//Empty Default Constructor creation,encapsulation
private CircleFromSimpleGeometricObject(){}

//method overloading for single parameter
public CircleFromSimpleGeometricObject(double radius){
this.radius = radius;
}
//mehtod overloading for 3 parameter
public CircleFromSimpleGeometricObject(double radius,String color,boolean filled){
this.radius = radius; //
setColor(color);
setFilled(filled);
}
//There is no parameter in get method
    public double getRadius() {
        return radius;
    }
//There is always parameter in set method
    public void setRadius(double radius) {
        this.radius = radius;
    }

/*Return Area*/
@Override
    public double getArea(){
    return radius*radius*Math.PI;
    }
/*Return diameter*/
    public double getDiameter(){
    return 2*radius;
    }
    
    /*Return perimeter*/
@Override
public double getPerimeter(){
return 2*radius*Math.PI;
}
/*Return the circle info*/
public void printCircle(){
    System.out.println(" The circle is created "+ getDateCreated()+" and the radiius is "+ radius);
}
}
