/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaThrows;

import java.io.IOException;

/**
 *
 * @author User
 */
public class Testthrows1 {
    void m() throws IOException{
    throw new IOException("device error"); //checked exception
    }
    ///////////////
    void n() throws IOException{
    m(); //Method can be called in the same class without creating object no problem
    }
    ///////////////
    void p(){
    try{
    n();
    }catch(Exception e){System.out.println("exception handled");}
    
    ///Main method
    }
    public static void main(String[] args) {
        Testthrows1 obj = new Testthrows1();
        obj.p();
        System.out.println("normal flow.....");
    }
    
}
