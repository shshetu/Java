/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_Java;

/**
 *
 * @author shshe
 */
public class JavaInheritence2 {
    public static void main(String[] args) {
     Adder x = new Adder();
        System.out.println("My superclass is: "+x.getClass().getName());
        System.out.println(x.add(10, 32)+" "+x.add(10, 3)+" "+x.add(10, 10)+"\n");
    }
  
}
///2nd class
class Arithmetic{}

//3rd class
class Adder extends Arithmetic{
int add(int a,int b){
return a+b;
}
}
