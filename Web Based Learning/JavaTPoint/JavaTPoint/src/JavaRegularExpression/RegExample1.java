/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaRegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author shshe
 */
public class RegExample1 {

    public static void main(String[] args) {
        //1st way
        Pattern p = Pattern.compile(".s"); //. represents single character
        Matcher m = p.matcher("ks");
        boolean b = m.matches();

        //2nd way
        boolean b2 = Pattern.compile(".s").matcher("as").matches();

        //3rd way
        boolean b3 = Pattern.matches(".s", "as");
        System.out.println(b+" "+b2+" "+b3);
    }
}
