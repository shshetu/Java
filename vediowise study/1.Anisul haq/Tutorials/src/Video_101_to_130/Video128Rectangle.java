/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_101_to_130;

/**
 *
 * @author shshe
 */
public class Video128Rectangle extends Video128Shape{
    double length,width;
    Video128Rectangle(double length,double width){
    this.length = length;
    this.width = width;
    }
    
    
    @Override
    double area(){
        System.out.println("Area for rectangle:");
    return length*width;    
    }
}
