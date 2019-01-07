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
public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1,4,4,2,5,-3,6,2};
        int i = 0;
        while(i<= array.length-1){
        if(array[i]>array[i+1]){
        array[i] = array[i+1];
            
        }
        System.out.println(array[i]);
        i++;
        }
        
    }
 
}
