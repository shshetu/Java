/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_25_01_19_Chapter18_Recursion;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TowerOfHanoi {
    //Main method
    static int count = 0;
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of disks: ");
        int n = input.nextInt();
        
        //Find the solution recursively
        System.out.println("The movers are: ");
        moveDisks(n,'A','B','C');
        System.out.println("Number of moves: "+ count);
    }
    
    //Method for finidng the solution to move n disks from fromTower to toTower with auxTower
    public static void moveDisks(int n, char fromTower,char toTower, char auxTower){
    if(n==1) //base case or stopping case
    { count++;
            System.out.println("Move disk "+ n+ " from "+ fromTower+ " to "+ toTower);
    }else{
            count++;
moveDisks(n-1,fromTower,auxTower,toTower);
        System.out.println("Move disk "+ n+ " from "+fromTower+" to "+ toTower);
        moveDisks(n-1,auxTower,toTower,fromTower);
    }
    }

}
