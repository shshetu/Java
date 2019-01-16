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
public class Video141ExceptionHandling {
    public static void main(String[] args) {
       try{
       int[] Array = new int[5];
       Array[0] = 1;
       Array[1] = 2;
           System.out.println("Array: "+ Array[1]);
           ///StringIndexOutOfBoundsException
           String s = "Shetu";
           System.out.println("Character at 0 th position: "+ s.charAt(10));
           //First exception block of Multiple blocks will be executed
           int y = 10/0;
           
       
        }catch(ArithmeticException e1){  
            System.out.println("Exception : "+ e1);
            }catch(ArrayIndexOutOfBoundsException e2){  
            System.out.println("Exception: "+ e2);
            }catch(StringIndexOutOfBoundsException e3){
              System.out.println("Exception: "+ e3);
             }catch(Exception e){
            System.out.println("Exception: "+e);
            }
        
      finally{
        System.out.println("Last line of the program: "); //It will must execute
       }
    }
  
}
