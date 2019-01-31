/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvidencePractice;

/**
 *
 * @author User
 */
public class Array2DSortGFG {
    public void sortRowWise(int m[][]){
    //loop for the rows of matrix
        for (int i = 0; i < m.length; i++) {
            
    //loop for the column of matrix
            for (int j = 0; j < m[i].length; j++) {
                //loop for comparison and swapping
                for (int k = 0; k < m[i].length-j; k++) {
                    if(m[i][k]>m[i][k+1]){
                    //swapping of elements
                    int temp = m[i][k];
                    m[i][k] = m[i][k+1];
                    m[i][k+1] = temp;
                    }
                }
            }
        }
        //Printing the sorted matrix
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]+" ");
                System.out.println("");
            }
        }
    }
    
    
    public static void main(String[] args) {
        int m[][] ={
            {9,8,7,1},
            {7,3,0,2},
            {9,5,3,2},
            {6,3,1,2}
        };
      
    }
}
