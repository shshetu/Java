/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_131_to_155;

import java.util.LinkedList;

/**
 *
 * @author shshe
 */
public class Video148StudentListDemo {
    public static void main(String[] args) {
        
        //Creating linkedList
        LinkedList<Video148Student> list = new LinkedList<Video148Student>();
   
        
        //Creating student object and initializing
        Video148Student s1 = new Video148Student("Shetu",101);
        Video148Student s2 = new Video148Student("Shanta",102);
        Video148Student s3 = new Video148Student("Nodi",103);
        Video148Student s4 = new Video148Student("Rafsan",104);
    
   //Adding the objects to the list
   list.add(s1);
   list.add(s2);
   list.add(s3);
   list.add(s4);
        ///Printing the LinkedList
    for(Video148Student s :list){
        System.out.println(s.name+" "+s.id);
    }
    
    
    }
    
    
        }
        
        
        
        
        
        
        
        
        
        
        
    

