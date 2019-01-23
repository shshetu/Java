package JavaVectors;


import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shshe
 */
public class VectorExample2 {
    public static void main(String[] args) {
        //Create an empty vector
        Vector <Integer> in = new Vector<>();
        
        ///Add elements in the vector
        in.add(100);
        in.add(200);
        in.add(300);
        in.add(400);
        in.add(500);
        in.add(600);
        in.add(700);
        
        //Display the vector elements
        System.out.println("Values in vector: "+ in);
        
        //use remove() method to delete th first occurence of an element
        System.out.println("Remove first occurence of element 200: "+ in.remove(0));
        
        //Display the vector elements after remove() mehtod
        System.out.println("Values in vector: "+ in);
        
        //Remove the element at index 4
        System.out.println("Remove element at index 4: "+ in.remove(4));
        System.out.println("New value list in vector: "+ in);
        
        //Remove an element
       in.removeElementAt(4);
        
        //Checking vector and displays the element
        System.out.println("Vector element after removal: "+ in);
        
        //Ge the hashCode for this vector
        System.out.println("Hash code of this vector: "+ in.hashCode());
        
       //Get the element at specified index
        System.out.println("Element at index 1 is: "+ in.get(1));
    }
}
