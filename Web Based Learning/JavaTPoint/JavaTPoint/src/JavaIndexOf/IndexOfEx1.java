/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIndexOf;

/**
 *
 * @author shshe
 */
public class IndexOfEx1 {
    public static void main(String[] args) {
        String s1 ="this is index of example";
        //passing substring
        int index1 = s1.indexOf("is"); //2 = starting from 2nd index
        int index2 = s1.indexOf("index"); //8
        System.out.println(index1 +" "+ index2);//2 8
        
        //passing substring with from index
        int index3 = s1.indexOf("is",4); //returns the index of is substring after 4th index
        System.out.println(index3); //5
        
        //passing char value
        int index4 = s1.indexOf('s');
        System.out.println(index4);
    }
}
