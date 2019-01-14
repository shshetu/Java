/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_131_to_155;

/**
 *
 * @author shshe
 */
abstract public class Video131Shape {
    double dim1,dim2; //for rectangle
    
    //Creating constructor
    Video131Shape(double dim1,double dim2){
    this.dim1 = dim1;
    this.dim2 = dim2;
    }
    
    ///Abstract Method
    abstract void area();
}
