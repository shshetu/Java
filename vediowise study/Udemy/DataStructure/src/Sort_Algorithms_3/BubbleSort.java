/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort_Algorithms_3;

/**
 *
 * @author shshe
 */
public class BubbleSort {
    public static void main(String[] args) {
     //  int totalsteps = 0;
        int steps=0;
       int[] intArray = {20,35,-15,7,55,1,-22};
       //outer loop for sorted partition
        for (int lastUnsortedindex = intArray.length -1; lastUnsortedindex >0; lastUnsortedindex--) {
            //innerloop for unsorted partition
            for (int i = 0; i <lastUnsortedindex ; i++) {
           
                if(intArray[i]>intArray[i+1]){
                    swap(intArray, i, i+1);
                    
                }
            }
        }
        
        //printing the loop 
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
            
        }




    
}
    //creating swap method
  public static void swap(int[] array,int i, int j){
        if(i == j){return;}
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        }
    
}
