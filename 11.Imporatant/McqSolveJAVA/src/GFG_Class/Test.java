/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GFG_Class;

/**
 *
 * @author shshe
 */
public class Test {
   
    public static void main(String[] args) {
        Test obj = new Test();
        obj.start();
    }
    void start() {
        String stra = "do";
            String strb = method(stra);
        System.out.println(": "+ stra + strb );
    }
    String method(String stra) {
        stra = stra + "good ";
        System.out.print(stra);
        return "good";
        
    }

}
