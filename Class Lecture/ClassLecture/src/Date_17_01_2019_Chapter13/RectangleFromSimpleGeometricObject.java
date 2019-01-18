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
public class RectangleFromSimpleGeometricObject extends GeometricObject{
    private double width;
    private double height;
    
    public RectangleFromSimpleGeometricObject(){}
    
    public RectangleFromSimpleGeometricObject(double width,double height){
    this.width = width;
    this.height = height;
    }
    
    public RectangleFromSimpleGeometricObject(double width, double height,String color,boolean filled){
    this.width = width;
    this.height = height;
    setColor(color); //here color is inheritated, local perameter color is initialized
    setFilled(filled);
    }
    
    /*Return width*/
    public double getWidth(){
    return width;
    }
    /*Set a new Width*/
    public void setWidth(double width){
    this.width = width;
    }
    /*Return height*/
public double getHeight(){
return height;
}
/*Set a new Height*/
public void setHeight(double height){
this.height = height;
}

/*Reurn Area*/
    @Override
    public double getArea() {
    return width*height;
    }
/*Return perimeter*/
    @Override
    public double getPerimeter() {
        return 2*(width+height);
    }
}
