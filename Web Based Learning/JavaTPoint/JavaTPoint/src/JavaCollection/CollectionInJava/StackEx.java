/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.CollectionInJava;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author shshe
 */
public class StackEx {
    public static void main(String[] args) {
        //creating object of Stack
        Stack<String> stack = new Stack<String>();
        //add usign push and pop
        stack.add("Shetu"); //
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        
        stack.pop();
        
        Iterator<String> itr = stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
