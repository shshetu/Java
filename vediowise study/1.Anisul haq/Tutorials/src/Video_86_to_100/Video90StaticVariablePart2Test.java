/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_86_to_100;

/**
 *
 * @author shshe
 */
public class Video90StaticVariablePart2Test {
    public static void main(String[] args) {
       Video90StaticVariablePart2 obj = new  Video90StaticVariablePart2();
        System.out.println("Non Static variable: "+ obj.universityName);
        System.out.println("Static Variable: "+  Video90StaticVariablePart2.uni);
    }
}
