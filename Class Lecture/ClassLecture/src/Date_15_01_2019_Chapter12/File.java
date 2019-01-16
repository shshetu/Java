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
public class File {
    public static void main(String[] args) throws Exception {
        File newFile = new File("my_new_file.txt");
        printFileDetails(newFile);
        
//create a new file
boolean fileCreated  = newFile.createdNewFile();
if(!fileCreated){
    System.out.println(newFile+" could not be creatd.");
}
printFileDetails(newFile);

//Delete the new file
newFile.delete();
        System.out.println("After deleting the new file: ");
        printFileDetails(newFile);
        
        //recreate the file
        newFile.createNewFile();
        printFileDetails(newFile);
        
        //Let's tell the JVM to delete this file on dexit
        //newFile.deleteOnExti();
        System.out.println("After usging deleteonExitMethod: ");
    }
    
    
    public static void printFilesDetails(File f){
    
        System.out.println("Absolute Path: "+ f.getAbsoluteFile());
        System.out.println("File exits: "+ f.exists());
    
}

    File(String my_first_filetxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean createNewFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean exists() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean renameTo(File secondFile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean renameTo(File secondFile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}