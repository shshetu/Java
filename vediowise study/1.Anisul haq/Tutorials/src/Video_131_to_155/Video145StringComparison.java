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
public class Video145StringComparison {
    public static void main(String[] args) {
        String pass1 = "Shetu123";
        String pass2 = "Shetu123";
        String pass3 = new String("Shetu123");
        String pass4 = new String("Shetu123");

            ////equals() Method checks the content not the references
            System.out.println(pass1.equals(pass2));
            System.out.println(pass1.equals(pass3));
            System.out.println(pass1.equals(pass4));
            System.out.println(pass3.equals(pass4));
            
            /// == operator checks the refferce not the content
            System.out.println("== operator:");
             System.out.println(pass1 == pass2);
            System.out.println(pass1 == pass3);
            System.out.println(pass1 == pass4);
            System.out.println(pass3 == pass4);
            
            // equalsIgnoreCase() for ignoring cases and equites
            System.out.println("equalsIgnoreCase()");
            System.out.println(pass1.equalsIgnoreCase(pass4));
            

    }
   
}
