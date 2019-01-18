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
        //How to create folder
        File dir = new File("C:/Users/shshe/OneDrive/Desktop/Person"); //Create a folder in desktop
        
    dir.mkdir(); //directory will be created
    String dirLocation = dir.getAbsolutePath();
        System.out.println("DirLocation: "+ dirLocation);
        System.out.println("Directory name: "+ dir.getName()); ///getName() = It will provide the full name
//        if(dir.delete()){
//            System.out.println(dir.getName()+" has been deleted!");
//        }
        
        //How to create file
        File file1 = new File(dirLocation+"/student.txt");
        File file2 = new File(dirLocation+"/teacher.txt");
        //try catch/////////////////////////
        try {
        file1.createNewFile();
        file2.createNewFile();
            System.out.println("Files are created!");
        }catch(Exception e){System.out.println(e);}
        ///File1 exists
        if(file1.exists()){System.out.println("File1 exists!");}
        else{System.out.println("File1 does not exits!");}
        
    }
}
