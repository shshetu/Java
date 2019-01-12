/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_101_to_130;

/**
 *
 * @author shshe
 */
public class Video103_VariableLengthArgument {
    
    ///Creating a void method
    /*void add(int num1, int num2){
        System.out.println("Addition: "+(num1+num2));
        
    }
*/
    //Method Overloading for 3 numbers
     void add(int num1, int num2,int num3){
        System.out.println("Addition: "+(num1+num2+num3));
        
        ///Creating Variable length arguments
       
        
     }
     
     void add(int ... num){
     int sum = 0;
     for(int x:num){
     sum+=x;
     }
         System.out.println("Sum: "+ sum);
     }
    
        
    }

