/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExceptionHandling.throwsKeyword;

import java.io.IOException;

/**
 *
 * @author shshe
 */
public class DeclareTheException {
    public static void main(String[] args) throws Exception {
        Min m = new Min();
        m.method();
    }
   
}
//create a class

class Min{
void method() throws Exception{
throw new java.io.IOException("Device Operation performed!");
}
}
