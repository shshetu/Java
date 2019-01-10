/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_10_1_2019_Chater10;

/**
 *
 * @author User
 */

                        //Composition

//Car must have Engine
public class Car {
    
//engine is a mandatory part of the car
    private final Engine engine; //Declaring object
    public Car(){
    engine  = new Engine(); //Instantiation Object
    }
    
}
//Engine Object
class Engine{}




