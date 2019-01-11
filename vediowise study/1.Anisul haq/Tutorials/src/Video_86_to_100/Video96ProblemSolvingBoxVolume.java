/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_86_to_100;

/**
 *
 * @author shshe
 */
public class Video96ProblemSolvingBoxVolume {
    
//Declaring instance variables
    double height,width,depth;
    
    //Declaring Constructor
    Video96ProblemSolvingBoxVolume(double h,double w,double d){
    height = h;
    width = w;
    depth = d;
    }
    
    void displayVol(){
    
    double result = height*width*depth;
        System.out.println("Volume: "+ result);
    }
    
    
}
