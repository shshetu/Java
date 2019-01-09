/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vedio_75to85;

/**
 *
 * @author shshe
 */
public class Vedio83ParameterizedMethodTest {
    public static void main(String[] args) {
       
        //Object Create
        Vedio83ParameterizedMethod teacher1 = new Vedio83ParameterizedMethod();
        //Object Initialize
        teacher1.setInfo("Shetu", "Male", 1234);
     teacher1.diplayInfo();
       
        Vedio83ParameterizedMethod teacher2 = new Vedio83ParameterizedMethod();
     teacher2.setInfo("Shanta", "Female", 5678);
     teacher2.diplayInfo();
     
     Vedio83ParameterizedMethod teacherTwo = new Vedio83ParameterizedMethod();
     teacherTwo.setInfo("Nodi","Female",12353);
     teacherTwo.diplayInfo();
    }
}
