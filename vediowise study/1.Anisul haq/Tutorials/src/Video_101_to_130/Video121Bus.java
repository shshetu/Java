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
public class Video121Bus extends Video121Car {
    double price;
    Video121Bus(String c,double w,int g,double p){
    super(c,w,g);
    price = p;
    }
    void displayArttibute(){
    super.displayAttribute();
        System.out.println("Price: "+ price);
    }
    }

