/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavatpointInterviewQuestions;

/**
 *
 * @author shshe
 */
public class ConstructorChaining_Q_55 {
    int id,age;
    String name, address;
    public ConstructorChaining_Q_55(int age){
    this.age = age;
    }
    public ConstructorChaining_Q_55(int id,int age){
    this(age);
        this.id = id;
    }
    public ConstructorChaining_Q_55(int id, int age,String name,String address){
    this(id,age);
    this.name = name;
    this.address = address;
    }
    public static void main(String[] args) {
        ConstructorChaining_Q_55 emp = new ConstructorChaining_Q_55(105,25,"Shetu","Rupnagar");
        System.out.println("ID: "+ emp.id+ " Name: "+ emp.name+ " age: "+ emp.age+" address: "+emp.address);
    }
}
