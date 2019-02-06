/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_47_to_64;

import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author shshe
 */
public class Video50ArrayToList2 {
//Performance analysis
static String[] createArray(){
    String[] sArray = new String[550000];
    for (int i = 0; i < 10; i++) {
        sArray[i] = "Array "+ i;
    }
    return sArray;
}

//Main method
public static void main(String[] args) {
        String[] sArray = createArray();
        
        //Convert array to List
        List lList = Arrays.asList(sArray);
        System.out.println("Iterator Loop:");
        long lIteratorStartTime = new Date().getTime();
        System.out.println("Start: "+ lIteratorStartTime);
        
        //iterator loop
        Iterator<String> iterator = lList.iterator();
        while(iterator.hasNext()){
        String stemp = iterator.next();
        }
        
        long lIteratorEndTime = new Date().getTime();
        System.out.println("End: "+ lIteratorEndTime);
        long lIteratorDifference = lIteratorEndTime - lIteratorStartTime;
      
        System.out.println("End");
        
        //For loop
        for (int i = 0; i < lList.size(); i++) {
        long lForStartTime = new Date().getTime();
            System.out.println("Start: "+ lForStartTime);
    }

}

}
