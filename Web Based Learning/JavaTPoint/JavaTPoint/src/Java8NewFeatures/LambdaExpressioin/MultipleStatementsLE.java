/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8NewFeatures.LambdaExpressioin;

/**
 *
 * @author User
 */
interface Sayable3 {

    String say(String message);
}

public class MultipleStatementsLE {

    public static void main(String[] args) {
        //We can pass multiple statements in lambda Expression
        Sayable3 say1 = (message) -> {
            String str1 = "i would like to say, ";
            String str2 = str1 + message;
            return str2;
        };
        System.out.println(say1.say("time is precious"));
    }
}
