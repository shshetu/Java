/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_08_01_2019_chapter9;

/**
 *
 * @author User
 */
public class Sorting2DArrayUsingSelectionSort {
    public static void main(String[] args) {
        ///Initializing a 2D array
    int[][] Array2D = {{1,5,6},{6,4,3},{20,29,4}};
    
    //Selection Sort Using for loop
        for (int i = 0; i < Array2D.length; i++) {
             //int firstNum = Array2D[0][0]; 
            for (int j = i; j < Array2D[i].length; j++) {
               
                if(Array2D[i][j] > Array2D[i+1][j+1]){
                int temp = Array2D[i][j];
                    Array2D[i+1][j+1] = Array2D[i][j];
                    Array2D[i+1][j+1] = temp;
                }
               
            }
        }
        
        for (int i = 0; i < Array2D.length; i++) {
            for (int j = 0; j < Array2D[i].length; j++) {
                System.out.print(" "+ Array2D[i][j]);
            }
            System.out.println("");
        }
    
    
    }
 
   
   
}
