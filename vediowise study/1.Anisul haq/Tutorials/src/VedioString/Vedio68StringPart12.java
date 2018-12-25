/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VedioString;

/**
 *
 * @author shetu
 */
public class Vedio68StringPart12 {
    public static void main(String[] args) {
       String firstName = "Shahariar";
       String lastName = " Shetu";
       String fullName = firstName + lastName;
        System.out.println("Full Name: "+ fullName);
        
/// Concating using concat() method
String fullName1 = firstName.concat(lastName);
        System.out.println("Using Concat FullName1: "+ fullName1);
  
        //Upper casing using toUpperCase() method
        String upper = fullName.toUpperCase();
        System.out.println("Upper Caseing: "+ upper);
       
        //Lower casing using toUpperCase() method
        String lower = fullName.toLowerCase();
        System.out.println("Lower Caseing: "+ lower);
    
    //startWith("") Method
    boolean b = firstName.startsWith("Sha");
        System.out.println("b = "+ b);
    //endsWith("") method
        boolean b1 = lastName.endsWith("tu");
        System.out.println("b1 = "+ b1);
    
///Priniting Strings using for each loop
String[] names = {"Shetu","Shanta","Nodi"};
for(String x:names){System.out.println(x);}
    
    
    }
  
}
