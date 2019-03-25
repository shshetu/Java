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
public class Finalize_Method {
    @Override
    public void finalize(){System.out.println("finalize() is called!");}
    public static void main(String[] args) {
        Finalize_Method f1 = new Finalize_Method();
        Finalize_Method f2 = new Finalize_Method();
        f1 = null; //garbage is collected using System.gc()
        f2 = null;//garbage is collected using System.gc()
        System.gc();
    }
}
