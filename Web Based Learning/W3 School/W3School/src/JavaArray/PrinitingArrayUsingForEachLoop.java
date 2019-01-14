/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaArray;

/**
 *
 * @author User
 */
 class PrinitingArrayUsingForEachLoop {

    public static void main(String[] args) {
        int myArray[][][]
                = {
                    {
                        {1,2,3},{4,5,6}
                    
                    },{
                    
                        {7,8,9},{10,11,12}
                    }
                };
        for(int[][] x:myArray){
            for(int[] y: x)
        for(int z : y){
            System.out.print(" "+z);
        }
        }

    }
}
