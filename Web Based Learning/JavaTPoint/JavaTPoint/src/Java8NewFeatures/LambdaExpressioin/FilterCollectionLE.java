/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8NewFeatures.LambdaExpressioin;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author User
 */
//1st Class
class Product1 {

    int id;
    String name;
    float price;

//constructor:
    public Product1(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

}

public class FilterCollectionLE {
    public static void main(String[] args) {
        List<Product1> list = new ArrayList<>();
        list.add(new Product1(1, "Samsung A5", 150000f));
        list.add(new Product1(3, "Samsung A5", 650000f));
        list.add(new Product1(2, "Samsung A5", 250000f));
        list.add(new Product1(4, "Samsung A5", 2500f));
        list.add(new Product1(5, "Samsung A5", 19000f));
        list.add(new Product1(6, "Samsung A5", 150000f));
        
        //not clear
        //using lambda to filter data
        Stream<Product1> filtered_data = list.stream().filter(p -> p.price>20000);
        
        //using lambda to iterate through collection
        filtered_data.forEach(
        product ->System.out.println(product.name+": "+product.price)
        );
    }
}
