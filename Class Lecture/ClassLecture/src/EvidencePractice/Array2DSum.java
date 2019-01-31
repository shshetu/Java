/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvidencePractice;

//Algorithms:
/*
1. Enter the 2d Array
2. process 3 for loop with a temp variable
3. display the result
 */
public class Array2DSum {

    public static void main(String[] args) {
int sum = 0;
        int[][] array = {
            {1,2,4},
            {10,7,8}
        };
        System.out.println("Displaying the 2D Array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= array.length; j++) {
                sum+= array[i][j];
                System.out.print(" "+array[i][j]);
            }
   
        }
        System.out.println("\nSum: "+ sum);
    }
}
