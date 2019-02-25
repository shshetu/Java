/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.ArrayListDemo;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author shshe
 */
public class Book {
   int id;
   String name,author,publisher;
   int quantity;
   public Book(int id,String name,String author,String publisher,int quantity){
   this.id = id;
   this.name = name;
   this.author = author;
   this.publisher = publisher;
   this.quantity = quantity;
   }

}
   class ArrayListEx{
       public static void main(String[] args) {
           //creating list of Books
           List<Book> list = new ArrayList<Book>();
           
           //creating books to Book class
           Book b1 = new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
           Book b2 = new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
           Book b3 = new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
            //Adding books to BookList
           list.add(b1);
           list.add(b2);
           list.add(b3);
           //Traversing the list using for each loop
           for(Book b:list){ //Book type objcet b
               System.out.println(b.id+" "+b.name+" "+b.publisher+" "+b.quantity);
           }
       }
   }
