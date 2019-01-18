/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_131_to_155;

/**
 *
 * @author shshe
 */
public class Video144Person {
 String name;
int age;

//We constructor to initialize an object
public Video144Person(String name,int age){
this.name = name;
this.age = age;
}
 
//Overriding toString Method situated in Object Class
 @Override
 public String toString(){
return " Name: "+name+" Age: "+age;
}

}
