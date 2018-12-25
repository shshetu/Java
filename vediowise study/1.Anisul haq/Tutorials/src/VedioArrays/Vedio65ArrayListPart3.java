/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VedioArrays;
import java.util.ArrayList;
/**
 *
 * @author shetu
 */
public class Vedio65ArrayListPart3 {
    public static void main(String[] args) {
     
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();
    number1.add(10);
    number1.add(20);
    number1.add(30);
    number1.add(40);
        System.out.println("Number1= "+ number1);
    number2.add(1);
    number2.add(2);
    number2.add(3);
    number2.add(4);
        System.out.println("Number2= "+ number2);
    number3.addAll(number1);
        System.out.println("Number3= "+ number3);
        boolean result = number1.equals(number2);
        boolean result1 = number1.equals(number3);
        System.out.println(result);
        System.out.println(result1);
    }
        
    
}
