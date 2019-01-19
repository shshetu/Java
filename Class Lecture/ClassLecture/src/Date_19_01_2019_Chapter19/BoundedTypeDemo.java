/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_19_01_2019_Chapter19;



/**
 *
 * @author User
 */
public class BoundedTypeDemo {
    public static void main(String[] args) {
       Rectangle rectangle = new Rectangle(2,2);
       Circle  circle = new Circle(2);
        System.out.println("Same Area? "+ equalArea(rectangle,circle));
        
    }
    
    
}
