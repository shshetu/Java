/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavatpointInterviewQuestions;

// creating static context inside abstract class
abstract class Test{
static int i = 102;
static void TestMethod(){
    System.out.println(" Hi! I am good!!");
}
}

public class TestClass extends Test {
    public static void main(String[] args) {
        Test.TestMethod();
        System.out.println("i = "+ Test.i);
    }
}
