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
public class PrintingArrayUsingForEachLoop {
    public static void main(String[] args) {
        int[][] array = {
            {1,23,4,67},
            {3,40,6,78},
            {1,2,5,7,8}
        
        };
        for(int[] i:array){
        for(int j:i){
            System.out.print(" "+j);
        }
        }
    }
}
