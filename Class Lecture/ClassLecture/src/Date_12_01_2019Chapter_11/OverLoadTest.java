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
public class OverLoadTest {
    public static void main(String[] args) {
        OverLoad obj = new OverLoad();
        double result;
        obj.demo(10);
        obj.demo(10,20);
        result = obj.demo(5.5);
        System.out.println("OutPut: "+ result);
    }
}
