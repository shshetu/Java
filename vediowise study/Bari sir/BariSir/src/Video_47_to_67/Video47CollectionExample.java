/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_47_to_67;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author shshe
 */
public class Video47CollectionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //List interface is the super interface
    //LinkedList is the sub class
        List l = new LinkedList();
        l.add("List:angel");
        l.add("schildt");
        l.add("mathew");
        l.add("schildt");
        print(l);  //Invoking Customized method
    
        Set s = new HashSet();
        s.add("Set:rose");
        s.add("Set:schildt");
        s.add("mathew");
        s.add("schildt"); //Duplicate value we can insert but it will print only one schildt
    print(s); //Invoking Customized Method
    }
    
    
}
