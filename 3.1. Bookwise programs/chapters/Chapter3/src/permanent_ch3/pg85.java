/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permanent_ch3;

/**
 *
 * @author User
 */
public class pg85 {
    public static void main(String[] args) {
        final double eps = 1E-14;
        double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
        if(Math.abs(x - 0.5)<eps){
            System.out.println(x+" is approximately 0.5 " );
        }
    }
  
}
