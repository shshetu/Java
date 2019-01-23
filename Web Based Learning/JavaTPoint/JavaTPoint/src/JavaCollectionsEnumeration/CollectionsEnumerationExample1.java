/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollectionsEnumeration;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author shshe
 */
public class CollectionsEnumerationExample1 {
    public static void main(String[] args) {
        Vector<String> Enum = new Vector<String>();
        Enum.add("JAVA");
        Enum.add("JSP");
        Enum.add("SERVLET");
        Enum.add("C");
        Enum.add("PHP");
        Enum.add("PERL");
        
        //Create Enumeration
      //  Enumeration <String> en = Collections.enumeration(Enum);
      Enumeration en = Enum.elements(); ///Both of them are correct!
      System.out.println("The Enumeration List are: ");
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}
