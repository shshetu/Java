package JavaExceptionHandling.MultipleCatchBlock;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shshe
 */
public class MultipleCatchBlock2 {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            System.out.println(a[10]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs!");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception occurs!");
        }catch(Exception e){
            System.out.println("Parent Exception occurs!");
        }
        System.out.println("Rest of the code!");
    }
}
