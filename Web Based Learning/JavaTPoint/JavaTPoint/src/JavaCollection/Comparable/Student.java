/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection.Comparable;

/**
 *
 * @author User
 */
public class Student implements Comparable<Student>{
 int rollno;
 String name;
 int age;
 Student(int rollno,String name,int age){
 this.rollno = rollno;
 this.name = name;
 this.age = age;
 }
 
 public int compareTo(Student st){
 if(age == st.age)
     return 0;
 else if(age> st.age)
     return 1;
 else 
     return -1;
 }

    
}
