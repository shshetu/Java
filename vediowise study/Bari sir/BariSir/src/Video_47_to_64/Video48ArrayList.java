/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_47_to_64;

import java.util.ArrayList;

/**
 *
 * @author shshe
 */
public class Video48ArrayList {
    public static void main(String[] args) {
        //Define a growable Arraylist
      //Generics is a Collection object which is kept inside the diamond head
      //Main function of Generics is typecasting
        ArrayList<String> list = new ArrayList();  ///Here <> is called Diamond Head
        System.out.println("Size: "+ list.size() + " and, Element inside the ArrayList: "+ list);
        
        //Adding values in ArrayList:
        //obj_name.add(value) 0r obj_name.add(index,value)
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add(0,"E");
        list.add(1,"F");
        System.out.println("Size: "+ list.size()+" and, Element inside thee ArrayList: "+ list); //when we print list= object it will show the result in []
        
//for removing any value obj_name.remove()
list.remove("A");
list.remove(3);
          System.out.println("Size: "+ list.size()+" and, Element inside thee ArrayList: "+ list); //when we print list= object it will show the result in []
        System.out.print("Printing Result using for loop: ");
          //looping ArrayList:
          for (int i = 0; i < list.size(); i++) {
            String s = list.get(i); //TO get the ith indexed value we use get() method
              System.out.print(s+" ");
        }
        
                
    }
}
