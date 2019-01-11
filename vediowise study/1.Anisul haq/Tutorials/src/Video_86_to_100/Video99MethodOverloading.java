/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_86_to_100;

/**
 *
 * @author shshe
 */
public class Video99MethodOverloading {
    public static void main(String[] args) {
       Video99MethodOverloading obj = new Video99MethodOverloading();
       obj.add();
       obj.add(1f,2.4);
       obj.add(1,2);
       obj.add(4,3,1);
    }
    
    void add(double a, double b){System.out.println(a+b);}
    void add(int a, int b){System.out.println(a+b);}
    void add(double a, double b, double c){System.out.println(a+b+c);}
    void add(){System.out.println("Nothing to print!");}
}
