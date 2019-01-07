/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_05_01_19_Chapter7_MulitDimensionalArray_Pg_260;

/**
 *
 * @author User
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int twoD[][] = {
            {2,3,5,6},{7,8,9},{1,4,7,9}
        };
        System.out.println("twoD[2][1]: " + twoD[2][3]);
        
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(twoD[i][j]);
            }
        }
       /* 
        for (int oneD[]:twoD) {
            for(int i: oneD){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
        
        */
    }
}
