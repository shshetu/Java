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
public class Video128Triangle extends Video128Shape{
   double base,height;
   
   Video128Triangle(double base,double height){
   this.base = base;
   this.height = height;
   }
   
   @Override
   double area(){
       System.out.println("Area for triangle:");
   return 0.5*base*height;
   }
}
