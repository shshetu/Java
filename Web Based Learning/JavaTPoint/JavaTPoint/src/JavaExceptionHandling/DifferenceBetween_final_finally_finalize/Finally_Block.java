/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExceptionHandling.DifferenceBetween_final_finally_finalize;

/**
 *
 * @author shshe
 */
public class Finally_Block {
    public static void main(String[] args) {
        try {
            int x = 300;
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{System.out.println("finally block is executed!");}
    }
}
