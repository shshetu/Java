/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3Exercises;

import java.util.Scanner;

/*
Algorithm:
1.Prompt three integers
2. Sort them using Array  4,5,
3. Display result
*/
public class SortThreeIntegers_Ex_3_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers respectively: ");
        
        //Inputing number in an Array
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
        array[i] = input.nextInt();
        }
        System.out.println("Asceding order: ");
        //Sorting the array inputs
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                 if(array[i]>array[j]){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
                 
            }
        
            }
        }
        //display
        for (int i = 0; i < array.length; i++) {
              System.out.println(array[i]);
        }
    }
   
}
