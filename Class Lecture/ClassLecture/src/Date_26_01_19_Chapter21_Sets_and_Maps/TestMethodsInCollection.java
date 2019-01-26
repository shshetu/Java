/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_26_01_19_Chapter21_Sets_and_Maps;

/**
 *
 * @author User
 */
public class TestMethodsInCollection {
    public static void main(String[] args) {
        //Create set1
        java.util.Set<String> set1 = new java.util.HashSet<>();
        
        //Add string to set1
        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Francisco");
        set1.add("Beijing");
        
        System.out.println("set1 is "+ set1);
        System.out.println(set1.size() + " elements in set1");
        
        //Delete a string from set1
        set1.remove("London");
        System.out.println("\nset1 is "+ set1);
        System.out.println(set1.size()+ " elements in set1");
        
        //Create set2
        java.util.Set<String> set2 = new java.util.HashSet<>();
        
        //Add strings to set2
        set2.add("London");
        set2.add("Shanghai");
        set2.add("Paris");
        System.out.println("\nset2 is "+ set2);
        System.out.println(set2.size() + " elements in set2");
        System.out.println("\n Is Taipei in set2? "+ set2.contains("Taipei"));
        set1.addAll(set2); //addAll() method
        System.out.println("\nAfter adding set2 to set1, set1 is "+ set1);
        
        set1.removeAll(set2); //removeAll(set2) will remove set2 from set1
        //If we could use only set1.removeAll() it would remove all the elements from set1
        System.out.println("After removing set2 from set1, set1 is "+ set1);
        
        set1.retainAll(set2); //It will keep only the common terms in both sets
        System.out.println("After removing common elements in set2 "+ " from set1, set1 is "+ set1);
        
        
        
    }
}
