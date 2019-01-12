/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwitchStatement;

/**
 *
 * @author User
 */
public class JavaDayProgram {
  private int inputedDay;
  
  //getter and setter method to make private field public
  public void setDay(int inputedDay){this.inputedDay = inputedDay;}
  public int getDay(){return inputedDay;}
    void day(){
   switch(inputedDay){
       case 1: System.out.println("Monday!");break;
       case 2: System.out.println("Tuesday!");break;
       case 3: System.out.println("Wednesday!");break;
       case 4: System.out.println("Thursday!");break;
       case 5: System.out.println("Friday!");break;
       case 6: System.out.println("Saturday!");break;
       case 7: System.out.println("Sunday!");break;
       default: System.out.println("Weekend!");
   }
   
   }
}
