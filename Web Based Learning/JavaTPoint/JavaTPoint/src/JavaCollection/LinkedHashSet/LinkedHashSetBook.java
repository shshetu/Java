/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.LinkedHashSet;

import java.util.LinkedHashSet;

/**
 *
 * @author User
 */
public class LinkedHashSetBook {
   //creating fields
    int id;
    String name, author, publisher;
    int quantity;
    
    //Using constructor
    public LinkedHashSetBook(int id,String name,String author,String publisher,int quantity){
    this.id = id;
    this.name = name;
    this.author = author;
    this.publisher = publisher;
    this.quantity = quantity;
    
    }
    
}

//Creating new Class
class LinkedHashSetEX{
    public static void main(String[] args) {
    LinkedHashSet <LinkedHashSetBook> hs = new LinkedHashSet<>();
//creating books
LinkedHashSetBook b1 = new LinkedHashSetBook(101,"LEt us C","Yashwant Kanetkar","BPB",8);
LinkedHashSetBook b2 = new LinkedHashSetBook(101,"LEt us C","Yashwant Kanetkar","BPB",8);
LinkedHashSetBook b3 = new LinkedHashSetBook(101,"LEt us C","Yashwant Kanetkar","BPB",8);
    
//Adding these books to LinkedHashset
hs.add(b1);
hs.add(b2);
hs.add(b3);

//Traversing hash table
for(LinkedHashSetBook b:hs){
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
}
    
    }

}
