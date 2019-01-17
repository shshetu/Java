/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_17_01_2019_Chapter13;

import java.math.BigInteger;

/**
 *
 * @author User
 */
//Page 510
public class SortComparbleObjects {
    public static void main(String[] args) {
        //Declaring String Array named cities
        String[] cities = {"Savannah","Boston","Atlanta","Tampa"};
        java.util.Arrays.sort(cities);
        for(String city: cities){
            System.out.print(city+" ");
        }
                  System.out.println("");  

        
        BigInteger[] hugeNumbers = {new BigInteger("2323231092923992"),
        new BigInteger("432232323239292"), new BigInteger("54454543534524")};
        java.util.Arrays.sort(hugeNumbers);
        
        for(BigInteger number: hugeNumbers){
            System.out.print(number+" ");
        }
    }
}
