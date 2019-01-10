/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_09_01_2019_Chapter9;

/**
 *
 * @author User
 */
public class TPEncapsulationTest {
  private String name;
  private String idNum;
  private int age;
  ///Making privates public
  public int getAge(){
  return age;
  }
  public String getName(){
  return name;
  }
  public String getIdNum(){ //In getter Method must have return keywords
  return idNum;
  }
  ////////////End the getter Methods
  
  //Starting Setter Methods
  
//Setting age
  public void setAge(int newAge){ //Setter method does not need any return keywords but must have parameters
      
  age = newAge;
  }
///Setting name
public void setName(String newName){
name = newName;
}  
  
//Setting idNum
public void setIdNum(String newIdNum){
idNum = newIdNum;
}
    
}
