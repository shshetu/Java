/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_19_01_2019_Chapter19;

/**
 *
 * @author User
 */
public class GenericStack<E> { //generic type E declared
    //generic array list
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();
    
//getsize method ??
    public int getSize(){
    return list.size();
    }
    
    //Peek method declared
    public E peek(){
    return list.get(getSize()-1);
    }
    
    //Push method declared
    public void push(E o){ //??
    list.add(o);
    }
    
    //pop method declared
    public E pop(){
    E o = list.get(getSize() - 1);
    list.remove(getSize() - 1);
    return o;
    }
    
    //isEmpty Method Declared
    public boolean isEmpty(){
    return list.isEmpty();
    }
    
    //Using toString() method to print the object
    
    @Override
    public String toString(){
        return "stack: "+ list.toString();
        
    }
    
  
}
