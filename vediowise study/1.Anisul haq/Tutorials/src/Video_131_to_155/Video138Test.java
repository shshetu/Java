/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_131_to_155;

/**
 *
 * @author shshe
 */
public class Video138Test {
    public static void main(String[] args) {
        //widning = implicit type casting small -> big
        int x = 10;
        double y = x;
        System.out.println("Y: "+ y);
        
        //narrowing = explicit type casting big -> small
        double b = 10.5;
        int a = (int)b;
        System.out.println("A: "+ a);
    }
}
