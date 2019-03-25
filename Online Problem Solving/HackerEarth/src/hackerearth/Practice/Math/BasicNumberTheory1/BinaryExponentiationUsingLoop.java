/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth.Practice.Math.BasicNumberTheory1;

/**
 *
 * @author shshe
 */
public class BinaryExponentiationUsingLoop{
    int binaryExponent(int x,int n){
    int result =1;
    while(n>0){
    if(n%2 ==1){result=result*x;}
    x = x*x;
    n = n/2;
    }
    return result;
    }
}
