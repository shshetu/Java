/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_19_01_2019_Chapter19;

import static java.util.Arrays.sort;

/**
 *
 * @author User
 */
public class GenericSort {
    public static void main(String[] args) {
        //Create an Integer array
        ///Since Integer is a Wrapper Class that is why we have to input using new and Integer
        Integer[] intArray = {new Integer(2),new Integer(4),new Integer(3)};
        
        //Create a Double array
        Double[] doubleArray = {new Double(3.4),new Double(1.3),new Double(-22.1)};
//Create a Character Array
Character[] charArray = {new Character('a'),new Character('j'),new Character('r')};

///Create a String Array
String[] stringArray = {"Tom","Susan","Kim"};

//sort the arrays
sort(intArray);
sort(doubleArray);
sort(charArray);
sort(stringArray);

//Display the sorted Arrays ??
System.out.println("Sorted Integer Objects: ");
printList(intArray);
        System.out.println("Sorted Double objects: ");
        printList(doubleArray);
        System.out.println("Sorted Character objects: ");
        printList(charArray);
        System.out.println("Sorted String objects: ");
        printList(stringArray);
    }
//Sort an array of comparable objects
public static <E extends Comparable<E>> void sort(E[] list){
E currentMin;
int currentMinIndex;

for(int i = 0;i<list.length-1;i++){
//Find the minimum in the list[i+1 .. list.length-2]
currentMin = list[i];
currentMinIndex = i;
    for (int j = i+1; j < list.length; j++) {
        if (currentMin.compareTo(list[j])>0){
        currentMin = list[j];
        currentMinIndex = j;
        }
    }
//Swap list[i] with list[currentMinIndex] if necessary;
if(currentMinIndex != i){
list[currentMinIndex] = list[i];
list[i] = currentMin;
}
}

}
//Print an array of objects
public static void printList(Object[] list){
for(int i = 0;i<list.length;i++ ){
    System.out.println(list[i]+" ");
    System.out.println("");
}
}
     
    }

