/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_12_01_2019Chapter_11;

/**
 *
 * @author User
 */
public class MethodOverride2 extends MethodOverride1 {
    public void sayHello(){
        System.out.println("Flour from MethodOverride2");
    }
    
    public void sayHi(){
        super.SayHello();
        System.out.println("Hi, Shuvo, I am from MethodOverride2 class,sayHi Method");
    }
}
