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
///Our work is how a method returns an Array
public class pg260MultiDimensionalArray {
    public static void main(String[] args) {
  int[] li = {2,4,6,7,8};
  reverse(li);
        for(int p: reverse(li)){
            System.out.println(p);
        }
    }
    public static int[] reverse(int[] list){
    int[] result = new int[list.length];
        
    for (int i = 0, j = result.length -1 ; i < list.length; i++,j--) {
            result[j] = list[i];
        }
    
    return result;
    }
}
