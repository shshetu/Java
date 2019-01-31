/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvidencePractice;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Array2DsortUsingForEachLoop {
    public static void main(String[] args) {
        int[][] data = {
            {10,40,14,20},{25,22,30,40}
        
        };
        System.out.println("Data Table: ");
        for(int[] d: data){
        Arrays.sort(d);
        for(int a:d){
            System.out.print(a+", ");
        }
            System.out.println("");
        }
    }
}
