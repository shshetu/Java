/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_IO.JavaFilePermission;

import java.io.FilePermission;
import java.io.IOException;
import java.security.PermissionCollection;

/**
 *
 * @author User
 */
public class FilePermissionExample1FromJTP {
    public static void main(String[] args) throws IOException{
        String srg = "E:\\Shetu\\git\\shetu's git\\Java\\Web Based Learning\\JavaTPoint\\JavaTPoint\\src\\Java_IO\\JavaFilePermission\\IO Package\\java.txt";
        FilePermission file1 = new FilePermission("E:\\Shetu\\git\\shetu's git\\Java\\Web Based Learning\\JavaTPoint\\JavaTPoint\\src\\Java_IO\\JavaFilePermission\\IO Package\\-","read");
        PermissionCollection permission = file1.newPermissionCollection();
        permission.add(file1);
        if(permission.implies(new FilePermission(srg,"read,write"))){
            System.out.println("Read,Write permission is granted for the path "+srg);
        }else{
            System.out.println("No Read,Write Permission is granted for the path "+ srg);
        }
    }
   
}
