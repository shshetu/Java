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
public class Video131Rectangle extends Video131Shape {
    Video131Rectangle(double dim1,double dim2){
    super(dim1,dim2);
    }
    
    @Override
    void area(){
        double result = dim1*dim2;
        System.out.println("Rectangle Area: "+ result);
    }
}
