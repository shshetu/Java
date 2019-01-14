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
public class Video131Test {
    public static void main(String[] args) {
        Video131Shape shape;
        shape = new Video131Rectangle(10,10);
        shape.area();
        shape = new Video131Triangle(10,10);
        shape.area();
        shape = new Video131Circle(10);
        shape.area();
    }
}
