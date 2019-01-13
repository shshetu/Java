/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_101_to_130;

/**
 *
 * @author shshe
 */
public class Video112Test {
    public static void main(String[] args) {
       Video112Animal a = new Video112Animal();
       Video112Person p = new Video112Person();
       Video112Teacher t = new Video112Teacher();
       
       ////Checking by using instanceof variable
        System.out.println(a instanceof Video112Animal);
        System.out.println(p instanceof Video112Person);
        System.out.println(t instanceof Video112Teacher);
        System.out.println(t instanceof Video112Animal);
        System.out.println(p instanceof Video112Animal);
        System.out.println(p instanceof Video112Teacher);
          System.out.println(a instanceof Video112Teacher);
  
}}
