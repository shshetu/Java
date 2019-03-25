/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaRegularExpression;

import java.util.regex.Pattern;

/**
 *
 * @author shshe
 */
public class RegExpressionExample2 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".s", "as")); //2nd character is s so it is true
        System.out.println(Pattern.matches(".s", "mk")); //false
        System.out.println(Pattern.matches(".s", "mst")); //false 
        System.out.println(Pattern.matches(".s", "amms")); //false
        System.out.println(Pattern.matches("..s", "mas")); //true= 3rd character is s
        
    }
}
