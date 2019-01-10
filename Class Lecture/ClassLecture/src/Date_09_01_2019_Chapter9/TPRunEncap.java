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
public class TPRunEncap {
    public static void main(String[] args) {
        TPEncapsulationTest encap = new TPEncapsulationTest();
        encap.setName("James");
        encap.setAge(25);
        encap.setIdNum("1234ms");
        System.out.println("");
        System.out.println("Name: "+ encap.getName());
        System.out.println("Age: "+ encap.getAge());
        System.out.println("IdNum: "+ encap.getIdNum());
    }
    
}
