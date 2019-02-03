/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_1_20;

/**
 *
 * @author shshe
 */
public class Vidoe4_StaticVariable {
//salary variable is a private static variable
   private static double salary;
   int x; //instance/non-static variable
   //Department is a constant
   public static final String DEPARTMENT = "Development ";
   void test(){
   x = 0;
   salary = 345;
   }
   
   
    public static void main(String[] args) {
   
       //x = 0      //static member can not access no-static member directly. but static memeber can access static using object
       Vidoe4_StaticVariable sv = new Vidoe4_StaticVariable();
       sv.x = 100;
       salary = 1000;
        System.out.println(DEPARTMENT+" average salary: "+salary);
    }
}

