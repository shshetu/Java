/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_10_1_2019_Chater10;

/**
 *
 * @author User
 */
public class Pg379TestStackOfIntegers {
   public static void main(String[] args) {
Pg379TestStackOfIntegers stack = new Pg379TestStackOfIntegers(); 
for (int i = 0; i < 10; i++)
stack.push(i);
while (!stack.empty())
    System.out.print(stack.pop() + " "); 
   }
}
