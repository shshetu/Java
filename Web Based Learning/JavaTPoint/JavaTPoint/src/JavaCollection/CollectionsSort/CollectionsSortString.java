/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.CollectionsSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author User
 */
public class CollectionsSortString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("viru");
        list.add("saurav");
        list.add("mukesh");
        list.add("tahir");
        
        Collections.sort(list);
        
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());}
        
  
    
    }
}
