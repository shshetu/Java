/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaGenerics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author User
 */
public class TestGenerics2 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        //Put method to input
        map.put(1,"Vijay");
        map.put(4,"Umesh");
        map.put(2,"ankit");
        
//Now we use Map.Entry for set and Iterator
Set<Map.Entry<Integer,String>> set = map.entrySet();

Iterator<Map.Entry<Integer,String>> itr = set.iterator();
while(itr.hasNext()){
Map.Entry e = itr.next();//no need to typecast
System.out.println(e.getKey()+" "+e.getValue());
}
    }
   
}
