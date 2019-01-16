/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExceptions;

/**
 *
 * @author User
 */
public class TryCatch {
    public static void main(String[] args) {
    try{    
        int[] myNumber = {1,2,3};
        System.out.println(myNumber[10]);
    }
    catch(Exception e){
        System.out.println("Something went wrong!");
    }
    finally {
        System.out.println("The 'try catch' is finished.");
    }
    }
}
