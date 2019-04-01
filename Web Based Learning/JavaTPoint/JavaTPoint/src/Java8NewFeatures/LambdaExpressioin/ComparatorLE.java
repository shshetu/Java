/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8NewFeatures.LambdaExpressioin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author User
 */
//first class for comparator
class Product {

    int id;
    String name;
    float price;
//Consturctor

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
//second class for implementing comparator

public class ComparatorLE {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        //Adding Products
        list.add(new Product(1, "HP Laptop", 250000f));
        list.add(new Product(3, "HP Keyboard", 300f));
        list.add(new Product(2, "Dell Laptop", 250000f));
        System.out.println("Sorting on the basis of name....");

        //not clear
        //implementing lambda expression
        Collections.sort(list,(p1,p2)->{
        return p1.name.compareTo(p2.name);        }
        
        );
        
        for(Product p:list){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }
        
    }

    }

