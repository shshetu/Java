/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_08_01_2019_chapter9;

/**
 *
 * @author User
 */
public class AccessModifiersExample1 {

    
public static void main(String[] args) {
     AccessModifiersExample obj = new AccessModifiersExample();
     System.out.println("AccessModifiersExample: "+ obj.privateVar); //You can not access private property of someone 
     System.out.println("AccessModifiersExample: "+ obj.defaultVar);
     System.out.println("AccessModifiersExample: "+ obj.protectedVar);
     System.out.println("AccessModifiersExample: "+ obj.publicVar);
    }
}
