/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_1_20;

/**
 *
 * @author shshe
 */
public class Vidoe4_Local_Global_Variables {
   int y;
   public void calAge(){
   int age = 0;
   age =age +7;
   y = y+3; //By default value is 0s
       System.out.println("Age is: "+ age);
   
   }
    public static void main(String[] args) {
        Vidoe4_Local_Global_Variables obj = new Vidoe4_Local_Global_Variables();
        System.out.println(obj.y);
        obj.calAge();
        
    }
}
