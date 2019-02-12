/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays_and_Big_O_Notation_2;

/**
 *
 * @author shshe
 */
public class Array {
    public static void main(String[] args) {
        int[] intArray = new int[7];
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;
        //we wanna find out the index of 7
        int index = -1; //We are starting by -1 ,it is just the normal initialization and if its not found it will return -1 so that is why it is initialized with -1
        for (int i = 0; i < intArray.length; i++) {
            //System.out.println(intArray[i]);
            if(intArray[i]==7){index = i;break;}
        }
        System.out.println("index = "+ index);
    }
    
    
}
