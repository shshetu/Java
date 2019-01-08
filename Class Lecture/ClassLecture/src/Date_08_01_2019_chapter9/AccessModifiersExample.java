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
public class AccessModifiersExample {
private int privateVar = 5000;
int defaultVar = 1000;
protected int protectedVar = 500;
public int publicVar = 100;
    
public static void main(String[] args) {
     AccessModifiersExample obj = new AccessModifiersExample();
     System.out.println("AccessModifiersExample: "+ obj.privateVar);
     System.out.println("AccessModifiersExample: "+ obj.defaultVar);
     System.out.println("AccessModifiersExample: "+ obj.protectedVar);
     System.out.println("AccessModifiersExample: "+ obj.publicVar);
    }
}
