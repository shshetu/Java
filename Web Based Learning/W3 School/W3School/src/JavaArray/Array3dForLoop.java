/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaArray;

/**
 *
 * @author User
 */
public class Array3dForLoop {
    
    public static void main(String[] args) {
        int[][][] myArray = {
            {
                {1,2,3},{4,5,6}

            },{
                {7,8,9},{20,2,4}
            
            }
        
        };
        
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                for (int k = 0; k < myArray[j][k].length; k++) {
                    System.out.print(" "+ myArray[i][j][k]);
                }
            }
        }
    }
}
