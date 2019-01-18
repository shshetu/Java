/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_16_01_19;

/**
 *
 * @author User
 */
public class Grade {
    int number;
    
    //Creating constructor for initializing Object
    public Grade(int number){
    this.number = number;
    }
    
    //Creating Method to print the Grade
    void testGrade(){
       
    switch(number/10){
        case 10:
        case 9:
        case 8: System.out.println("A !");break;
        case 7: System.out.println("B !");break;
        case 6: System.out.println("C !");break;
        case 5: System.out.println("D !");break;
        case 4: 
        case 3: 
        case 2: 
        case 1: System.out.println("F !");break;
        default: System.out.println("Invalid Input!");
    }
        
        
        }
    
    }

