/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaEnum;

import java.util.Iterator;

/**
 *
 * @author shshe
 */
public class EnamExample1 {
    public enum Season {WINTER,SPRING,SUMMER,FALL}; //There will be no equal sign for java
    public static void main(String[] args) {
        System.out.println("#1 Printing enum using for each loop: ");
        for(Season s: Season.values()){
           System.out.println(s);
       }
        
    }
 
}
