/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavatpointInterviewQuestions;


public class Student6 {
    int id;
    String name;
    
    
    int Student6(String i, double j){
        System.out.println("From method: "+ i+ j);
        return 10;
    }
//constructor to intialize integer and string
    Student6(int i, String n){
    id = i;
    name = n;
    }
    
    //constructor to initialize another object
   Student6(Student6 s){
   id = s.id;
   name = s.name;
   }
    
    
    void display(){System.out.println(id+" "+name);
    }
    public static void main(String[] args) {
        Student6 s1 = new Student6(111,"Karan");
        Student6 s2 = new Student6(s1);
        s1.Student6("shetu", 5.6);
        
    }
}
