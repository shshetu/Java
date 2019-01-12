/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_101_to_130;

/**
 *
 * @author shshe
 */
public class Video103_VariableLengthArgumentTest {
    public static void main(String[] args) {
        //intanctiation
      Video103_VariableLengthArgument obj = new Video103_VariableLengthArgument();
     
      //for two variable initialization
      obj.add(10, 20);
      obj.add(10, 20,30);
      obj.add(10,20,30,40,60);
      
    }
 
}
