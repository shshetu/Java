/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8NewFeatures.LambdaExpressioin;

/**
 *
 * @author shshe
 */
//funtional interface
interface Sayable1 {
///SAM = parameterized

    public String say(String name);
}

public class SingleParameterLE {

    public static void main(String[] args) {
        //Lambda Expression with single parameter
        Sayable1 s1 = (name) -> {
            return "Hello, " + name;
        };
        //call the SAM
     //print it 
        System.out.println(s1.say("Shetu"));
        
        //We can omit function parenthisis
        Sayable1 s2 = name ->{
        return "Hello, "+name;
        };
        System.out.println(s2.say("Shanta"));
    }
    
    
        
}
