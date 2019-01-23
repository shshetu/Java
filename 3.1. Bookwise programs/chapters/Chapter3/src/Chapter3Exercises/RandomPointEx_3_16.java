package Chapter3Exercises;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class RandomPointEx_3_16 {
   /*
(Random point) Write a program that displays a random coordinate in a rectangle.
The rectangle is centered at (0, 0) with width 100 and height 200.
*/
    public static void main(String[] args) {
        //Generate random width and height
        int width = (int)(Math.random()*(50+50) - 50);
        int height = (int)(Math.random()*(100+100) - 100);
    }
	

}
