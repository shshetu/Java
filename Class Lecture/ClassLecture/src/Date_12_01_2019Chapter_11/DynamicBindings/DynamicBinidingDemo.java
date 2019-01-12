/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_12_01_2019Chapter_11.DynamicBindings;

/**
 *
 * @author User
 */
public class DynamicBinidingDemo {
    public static void main(String[] args)
    {
    m(new GraduateStudent());    
    m(new Student());    
    m(new Person());    
    m(new Object());    
    }
    public static void m(Object obj){
        System.out.println(obj.toString());
    
    }
    
}
