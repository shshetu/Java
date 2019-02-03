/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_1_20;

/**
 *
 * @author shshe
 */
public class Vedio4_InstanceVariable {
   //this instance variable is visible for any child class.
    public String name;
    //salary variable is visible in InstanceVariable class only
    private double salary;
    
    //The name variable is assigned in the constructor
    public Vedio4_InstanceVariable(String empName,double salary){
    name  = empName;
        this.salary = salary;

    }
   //The salary variable is assigned a value.
    public void setSalary(double empSal){
    salary = empSal;
    }
    
    //This method prints the InstanceVariable details.
    public void printEmp(){
        System.out.println("name: "+name);
        System.out.println("salary: "+salary);
    }
    public static void main(String[] args) {
        Vedio4_InstanceVariable empOne = new Vedio4_InstanceVariable("Shetu",10000);
       // empOne.setSalary(1000);
        empOne.printEmp();
    }
}
