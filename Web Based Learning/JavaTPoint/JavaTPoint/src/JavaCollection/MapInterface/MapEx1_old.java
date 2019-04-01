/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author shshe
 */
public class MapEx1_old {
    public static void main(String[] args) {
        Map map = new HashMap();
        //adding elements to map
        map.put(1, "amit");
        map.put(5, "rahul");
        map.put(2, "jai");
        map.put(6, "amit");
        //Traversing the map
        Set set = map.entrySet(); //converting to set so that we can traverse
        Iterator itr = set.iterator();
        while(itr.hasNext()){
        ///converting to Map.Entry so that we can ger key and value separately
        Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
