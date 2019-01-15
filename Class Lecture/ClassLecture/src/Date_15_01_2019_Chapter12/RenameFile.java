/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_15_01_2019_Chapter12;

/**
 *
 * @author User
 */
public class RenameFile {
    public static void main(String[] args) {
       File firstFile = new File("my_first_file.txt");
       File secondFile = new File("my_second_file.txt");
       
       boolean fileCreated  = firstFile.createNewFile();
       if(fileCreated || firstFile.exists()){
       printFilesDetails(firstFile);
       printFilesDetails(secondFile);
       }
       boolean renamedFlag = firstFile.renameTo(secondFile);
       if(!renamedFlag){
           System.out.println("Could not rename! "+ firstFile);
       }
       printFilesDetails(firstFile);
       printFilesDetails(secondFile);
       
     public static void printFilesDetails(File f){
           System.out.println("Absolute Path: "+ f.getAbsoluteFile());
           System.out.println("File exists: "+ f.exists);
       } 
    }
      
    }
 

