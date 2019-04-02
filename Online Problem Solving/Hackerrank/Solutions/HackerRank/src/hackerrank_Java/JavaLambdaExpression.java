/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author shshe
 */
interface PerformOperation {

    boolean check(int a);
}

class MyMath {

    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
    //Write your code here
    //interface overloading using lamda expression
    public static PerformOperation isOdd(){
    return n-> n%2 !=0;
    }
    public static PerformOperation isPrime(){
    return n -> (new java.math.BigInteger(String.valueOf(n)).isProbablePrime(100));
    }
    public static PerformOperation isPalindrome(){
    return n ->(String.valueOf(n).equals(new StringBuilder(String.valueOf(n)).reverse().toString()));
    }
    
}


public class JavaLambdaExpression {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); //either BufferedReader or Scanner 
        //Inside BufferedReader we use InputStreamReader
        //for InputStreamReader we use readLine() method

        //form interface
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            }else if(ch == 2){
            op = ob.isPrime();
            ret = ob.checker(op,num);
            ans = (ret) ?"PRIME" :"COMPOSITE";
            }else if(ch == 3){
            op = ob.isPalindrome();
            ret = ob.checker(op,num);
            ans  = (ret) ? "PALINDROME" :"NOT PALINDROME";
            }
            System.out.println(ans);
        }

    }
}
