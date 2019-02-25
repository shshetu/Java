/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.LinkedList;

import java.util.LinkedList;

/**
 *
 * @author shshe
 */
public class BookForLinkedList {
    int id;
    String name,author,publisher;
    int quantity;
    public BookForLinkedList(int id,String name,String author,String publisher,int quantity) {
    this.id = id;
    this.name = name;
    this.author = author;
    this.publisher = publisher;
    this.quantity = quantity;
    }
    
}
class LinkedListEx{
    public static void main(String[] args) {
        ///Creating Book list
        BookForLinkedList b1 = new BookForLinkedList(101,"Let us C","Yashwant Kanetkar","BPB",8);
        BookForLinkedList b2 = new BookForLinkedList(101,"Let us C","Yashwant Kanetkar","BPB",8);
        BookForLinkedList b3 = new BookForLinkedList(101,"Let us C","Yashwant Kanetkar","BPB",8);
        
        ///Creating LinkedList
        LinkedList<BookForLinkedList> ll = new LinkedList<>();
       
        
        //Adding to the LinkedList
         ll.add(b1);
        ll.add(b2);
        ll.add(b3);
        //Printing the LinkedList
       for(BookForLinkedList b:ll){
           System.out.println(b.id+" "+b.name+" "+" "+b.author+" "+b.quantity);
       }
    }
}
