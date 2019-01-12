/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_101_to_130;

/**
 *
 * @author shshe
 */
public class Video108SetterAndGetterMethod {
  private String name;
 private int age;
 private double mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMobile() {
        return mobile;
    }

    public void setMobile(double mobile) {
        this.mobile = mobile;
    }
 

 
 
 

//Creating Method to display
void display(){
    System.out.println("Name: "+ name);
    System.out.println("Age: "+ age);
}
        
}
