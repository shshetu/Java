/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaRegularExpression;

import java.util.regex.Pattern;

/**
Meta characters work as shortcodes rules: \\d
 */
public class RegMetaCharEx1 {
    public static void main(String[] args) {
        System.out.println("metacharacter d.......");
        System.out.println(Pattern.matches("\\d", "abc"));//false non digit
        System.out.println(Pattern.matches("\\d", "1")); //true ,digit
        System.out.println(Pattern.matches("\\d", "4433"));//false, more than one digit
        System.out.println(Pattern.matches("\\d", "s33"));//false, digit and characters
        
        System.out.println("Metacharacter D...");
        System.out.println(Pattern.matches("\\D", "abc"));//false, non digit but more than once
        System.out.println(Pattern.matches("\\D", "1")); //false, not non digit
        System.out.println(Pattern.matches("\\D", "3342a")); //false, mix of digit and non digit
        System.out.println(Pattern.matches("\\D", "m")); //true, non digit comes once
        
        System.out.println("MetaCharcters D with quantifier");
        System.out.println(Pattern.matches("\\D*", "mak")); //true, non-digit an may come 0 or more times
    }
}
