/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author User
 */
interface AdvancedArithmetic{
public abstract int divisorSum(int n);
}
//1st class
class Mycalculator implements AdvancedArithmetic{
public int divisorSum(int n){
int sum = 0;
    for (int i = 1; i*i <= n; i++) {
        if(n%i == 0){
        sum += i;
        }
     
    }
}
}
public class JavaInterface {
    
}
