/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaRecursion.JavaTPointPrograms;

/**
 *
 * @author shshe
 */
public class Ex4_Fibonocchi {
    static int n1=0,n2=1,n3=0;
    static void printFibo(int count){
    if(count>0){ //base case
    n3 = n1+n2;
    n1= n2;
    n2 = n3;
        System.out.print(" "+n3);
        printFibo(count-1);
    }
    }
    
    public static void main(String[] args) {
        int count = 15;
        System.out.print(n1+" "+ n2); //printing 0 and 1
        printFibo(count-2); //n-2 because 2 numbers are already printed
    }
}
