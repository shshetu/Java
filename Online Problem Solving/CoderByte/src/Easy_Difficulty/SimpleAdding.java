/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Easy_Difficulty;

import java.util.Scanner;

/**
 Challenge
Have the function SimpleAdding(num) add up all the numbers from 1 to num. For example: if the input is 4 then your program should return 10 because 1 + 2 + 3 + 4 = 10. For the test cases, the parameter num will be any number from 1 to 1000.
Sample Test Cases

Input:12

Output:78

Input:140

Output:9870

 */
public class SimpleAdding {
    public static int SimpleAdding(int num){
        
        int sum = 0;
        if(num>=1&& num<=1000){
        for (int i = num; i > 0; i--) {
            sum+= i;
        }
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        System.out.println(SimpleAdding(Integer.parseInt(input.nextLine())));
    }
}
