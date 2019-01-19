/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_131_to_155;

import java.io.File;

/**
 *
 * @author shshe
 */
public class Video151CreateFile {
    public static void main(String[] args) {
       
        //Initializing File class and making folder
        File dir = new File("person"); //It is a folder name(will be created in project folder)
        dir.mkdir(); //directory will be created
        
        //Creating folder on desktop
        File dir1 = new File("C:/Users/shshe/OneDrive/Desktop/Person"); //Creating folder in desktop
        dir1.mkdir();
        String  dir1Location = dir1.getAbsolutePath();
        System.out.println("Directory Name; "+dir1.getName()+" \nDirectory location: "+dir1Location);
        
        ///Path of the folder and file
        String path = "C:/Users/shshe/OneDrive/Desktop/Person/";
        //Creating file with .txt extension
        File file1 = new File(path+"Student.txt"); //Created files inside Person folder in desktop
        File file2 = new File(path+"Teacher.txt"); //Created files inside Person folder in desktop
        
        //We must create file inside try catch block sincre there might be some errors
        try{
        file1.createNewFile();
        file2.createNewFile();
            System.out.println("Files are created!");
        }catch(Exception e){System.out.println(e);}
   ///Do files exist?
   //file1.delete(); //We will always delete object 
   if(file1.exists()){System.out.println("File1 exists");}else{System.out.println("File1 does not exist");}
    
    }
    
}
