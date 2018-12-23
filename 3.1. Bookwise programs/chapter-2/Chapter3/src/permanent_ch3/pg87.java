/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permanent_ch3;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class pg87 {
    public static void main(String[] args) {
        int num1 = (int)(10*Math.random());
        int num2 = (int)(10*Math.random());
        System.out.println("First number:"+num1);
        System.out.println("Second number:"+num2);
        if(num1<num2){
        int tmp = num1;
        num1=num2;
        num2=tmp;
            
                }
        System.out.println("What is "+num1+"-"+num2+"?");
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your result:");
            int studentInput = input.nextInt();
            if((num1-num2)==studentInput){System.out.println("YOu are right!");}
            else{System.out.println("You are wrong!");}
     
    }
    
}
