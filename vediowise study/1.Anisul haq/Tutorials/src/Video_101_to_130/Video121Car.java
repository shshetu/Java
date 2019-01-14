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
public class Video121Car extends Video121Vehicle{
int gear;
Video121Car(String c,double w,int g){
super(c,w);
    gear = g;
}

@Override
void displayAttribute(){
super.displayAttribute();
    System.out.println("Gear: "+ gear);
}

}
   

