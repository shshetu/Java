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
public class Video131Circle extends Video131Shape {
    //dim1,dim2
    Video131Circle(double r){
    super(r,r);
    }
    
    @Override
    void area(){
        double result = Math.PI*dim1*dim2;
        System.out.println("Circle Area: "+ result);
    }
}
