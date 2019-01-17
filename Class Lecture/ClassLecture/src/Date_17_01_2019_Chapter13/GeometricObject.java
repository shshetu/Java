/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_17_01_2019_Chapter13;

import java.util.Date;

/**
 *
 * @author User
 */
public abstract class GeometricObject {
    //Page 496
    //instance variables
    private String color = "white"; ///Encapsulation and initialization
    private boolean filled; //Encapsulation and declaration only
    private java.util.Date dateCreated; //Encapsulation,calling class by package name,declaration
    
    /*Construct a default geometric object = Encapsulation*/
    protected GeometricObject(){
    dateCreated = new java.util.Date(); //intialize the date by Java util package
    }
    
    /*Construct a geometric object with color and filled value = Encapsulation,method overloading*/
   protected GeometricObject(String color,boolean filled){
   //instantiation
       dateCreated  = new java.util.Date(); //method overloading where new= keyword to instantiate the field
   this.color = color; //using this keyword initializing the local variable inside the instance variables
   this.filled = filled;
   }
   
   /*Return color = using the get() method, must have a return type*/
   public String getColor(){
   return color;
   }
   /*Set a new color using set method there should not be a return type, must have a local variable or parameter*/
   public String setColor(String color){
   this.color = color; //initialize the instance variable color with local variable
    return ""; //returing 0 will also be allowed since it is a method,and it must be string since the type of the method is String .and it must return empty Srring
   }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
   
   ///Use of Abstraction
    @Override
    public String toString(){
    return "created on "+ dateCreated+"\ncolor: "+ color + "and filled: "+filled;
    }
/*Abstract method getArea()*/
    public abstract double getArea();
    
    /*Abstract method getPerimeter()*/
public abstract double getPerimeter();
}
