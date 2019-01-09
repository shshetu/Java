/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vedio_75to85;

/**
 *
 * @author shshe
 */
public class Vedio83ParameterizedMethod {
    String name,gender;
    int phone;
   
    void setInfo(String n,String g,int ph){
    name = n;
    gender = g;
    phone = ph;
    }
  
    
    void diplayInfo(){
        System.out.println("");
        System.out.println("Name: "+ name);
        System.out.println("Gender: "+ gender);
        System.out.println("Phone: "+ phone);
    
    }
}
