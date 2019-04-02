/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCodePointAtMethod;

/**
 *
 * @author shshe
 */
public class CharacterCodePointEx1 {
    public static void main(String[] args) {
        String input = "This is the first program for the given method";
        System.out.println("This is the first program for the given method: ");
        int index = 4;
        System.out.println(input.charAt(index));
        System.out.println(input.codePointAt(index));
    }
}
