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
public class Vedio64ArrayListPart2 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(0,10);
        number.add(1,20);
        number.add(2,30);
        number.add(3,40);
        System.out.println("Size of Arrray List: " + number.size());
        System.out.print(number);
        
/////Print using for each loop
for(int x: number){
    System.out.print(" "+ x);
    
}   
number.remove(0);
        System.out.println("\nArray list after remove: "+number);
    //number.removeAll(number);
    boolean x = number.isEmpty();
        System.out.println(x);
        //number.clear();
        boolean y = number.contains(30);
        System.out.println(y);
        System.out.println(number.indexOf(40));
        number.set(2,100);
        System.out.println(number);
        System.out.println(number.get(0));
        
    }
    
    
    
    
}
