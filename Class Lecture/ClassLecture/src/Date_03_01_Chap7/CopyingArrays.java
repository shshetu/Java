/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_03_01_Chap7;

/**
 *
 * @author User
 */
public class CopyingArrays {
    public static void main(String[] args) {
        int[] sourceArray = {250,34,4,5};
        int[] targetArray = new int[sourceArray.length] ;
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
            System.out.println("Target Array: "+ targetArray[i]);
        }
    }
}
