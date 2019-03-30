/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Varargs_Methods.GFG;

/**
 *
 * @author shshe
 */
public class Test2 {
    ///Takes string as a argument followed by varargs
    static void fun2(String str,int ...a){
        System.out.println("String: "+str);
        System.out.println("Number of arguments is: "+a.length);
        
        //using for each loop
        for(int i:a){
            System.out.println(i+" ");
        }
    }
    //Driver code
    public static void main(String[] args) {
    fun2("GeeksforGeeks",100,200);    
    fun2("CSPortal1",1,2,3,4,5);    
    fun2("forGeeks");    
    }
}
