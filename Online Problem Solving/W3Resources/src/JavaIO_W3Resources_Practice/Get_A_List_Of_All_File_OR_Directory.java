/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIO_W3Resources_Practice;

import java.io.File;

/**
 *
 * @author shshe
 */
public class Get_A_List_Of_All_File_OR_Directory {
    public static void main(String[] args) {
        File file = new File("D:\\Idb\\git\\Shetu's git\\Java");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
  
}
