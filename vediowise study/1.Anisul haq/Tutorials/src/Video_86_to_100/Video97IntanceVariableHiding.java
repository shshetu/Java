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
public class Video97IntanceVariableHiding {
    //Declaring states or data fields 
    double height,width,depth;
    //constructor 
    Video97IntanceVariableHiding(double height,double width,double depth){
    this.height = height; //this.height reffers to the instance variable height
   this.width = width; //this.width reffers to the instance variable width
    this.depth = depth;//this.depth reffers to the instance variable depth
    }
    //Method for volume calculation(actions)
    void displayVol(){
    double totalVol = height*width*depth; //instance variable
        System.out.println("Total volume: "+ totalVol); //local vairable
    }
    
    //main mehtod 
    public static void main(String[] args) {
        Video97IntanceVariableHiding box1 = new Video97IntanceVariableHiding(10,10,10);
        Video97IntanceVariableHiding box2 = new Video97IntanceVariableHiding(20,30,10);
        box1.displayVol();
        box2.displayVol();
        
    }
}
