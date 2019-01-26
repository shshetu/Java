/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_26_01_19_Chapter21_Sets_and_Maps;

import java.util.LinkedHashSet;
import java.util.Set;

/*
1.LinkedHashSet extends HashSet
2.Java LinkedHashSet class contains unique elements only like HashSet
3. Java LinkedHashSet class provides all optional set operation and permits
null elements
4. Java LinkedHashSet class in non synchronized
5.
*/
public class LinkedHashset {
    public static void main(String[] args) {
        //Create a hash set
        Set<String> set = new LinkedHashSet<>();
        
        //Add strings to the set
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("san Francisco");
        set.add("Beijing");
        set.add("New York");
        System.out.println(set);
        
        //Display the elements in the hash set
        for(Object element: set){
            System.out.println(element.toString().toLowerCase()+" ");
        }
    }
}
