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
public class Finalize_Garbage_Collector {
    public static void main(String[] args) {
       Finalize_Garbage_Collector f = new Finalize_Garbage_Collector();
        System.out.println(f.hashCode());
        System.out.println("Starts garbage collection");
        f = null;
        //calling garbage collector
        System.gc();
        System.out.println("End of Garbage collection");
    }
    @Override
  protected void finalize(){
        System.out.println("finaliize method called!");
  }
}
