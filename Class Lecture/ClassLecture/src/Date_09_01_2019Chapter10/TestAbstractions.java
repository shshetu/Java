/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_09_01_2019Chapter10;

/**
 *
 * @author User
 */
public class TestAbstractions {
    public static void main(String[] args) {
        A a = new B();
        
        //b.display()
        a.display();
        a.sayHello();
        
A a2 = new C();
a2.display();
a2.sayHello();
        //c.display()
        
    }
}
