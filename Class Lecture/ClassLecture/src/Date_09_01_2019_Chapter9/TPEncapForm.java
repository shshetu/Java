/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_09_01_2019_Chapter9;

/**
 *
 * @author User
 */
public class TPEncapForm {
    private String name; 
    private int id;
   
    ///Using getter method to fabricate encapsulation
    public String getName(){return name;}
    public int getId(){return id;}
    
    //Using setter Method to over ride
    public void setName(String newName){name = newName;}
    public void setId(int newId){id = newId;}
}
