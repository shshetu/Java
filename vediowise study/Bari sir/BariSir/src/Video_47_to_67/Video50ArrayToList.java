/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_47_to_67;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author shshe
 */
public class Video50ArrayToList {
    public static void main(String[] args) {
        String[] sArray = new String[]{"Array 1","Array 2","Array 3"};
        
//Convert Array to List
//Arrays.asList() method will convert Arrays to list
List<String> lList = Arrays.asList(sArray);

//Several Types of printing ways

//#1. Print using formal for loop
System.out.println("#1 Print using formal for loop: ");
for (int i = 0; i < lList.size(); i++) {
            System.out.println(lList.get(i));
        }

//#2. Print using for each loop
System.out.println("#2 Print using for each loop: ");
for(String s: lList){
    System.out.println(s);
}
//#3. Print using while loop
System.out.println("#3 Print using while loop");
int j = 0;

while(lList.size()-1>= j){
    System.out.println(lList.get(j));
    j++;

}
System.out.println("#3 Print using while loop another logic: ");
int k = 0;
while(k<lList.size()){
    System.out.println(lList.get(k));
    k++;
}
//#4. Print using iterator
System.out.println("#4 Print using Iterator: ");
Iterator iterator = lList.iterator();
while(iterator.hasNext()){
    System.out.println(iterator.next());
}
    }
}
