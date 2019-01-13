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
public class Video111InheritingPrivateMemberExtending extends Video111InheritingPrivateMember{
    private String qualification;
   
    //Setter and Getter
    public void setQualification(String qualification){
    this.qualification = qualification;
    }
    public String getQualification(){
    return qualification;
    }
    void displayInfo2(){
        System.out.println("Qualification:" + qualification);
   }
    void display(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQualification());
    
    }
}
