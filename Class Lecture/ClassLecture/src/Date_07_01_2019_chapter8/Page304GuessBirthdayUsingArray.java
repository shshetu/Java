/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_07_01_2019_chapter8;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Page304GuessBirthdayUsingArray {
    public static void main(String[] args) {
        int day = 0; //Day to be determined
        int answer;
      int[][][] dates = {
 {{ 1, 3, 5, 7},
{ 9, 11, 13, 15},
 {17, 19, 21, 23},
 {25, 27, 29, 31}},
 {{ 2, 3, 6, 7},
 {10, 11, 14, 15},
 {18, 19, 22, 23},
{26, 27, 30, 31}},
{{ 4, 5, 6, 7},
{12, 13, 14, 15},
{20, 21, 22, 23},
 {28, 29, 30, 31}},
 {{ 8, 9, 10, 11},
 {12, 13, 14, 15},
 {24, 25, 26, 27},
 {28, 29, 30, 31}},
{{16, 17, 18, 19},
 {20, 21, 22, 23},
 {24, 25, 26, 27},
{28, 29, 30, 31}}};
      
//Create a Scanner
Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Is your birthday in Set" + (i+1)+ "?");
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
           
                    System.out.println("");
                }
            }
        }
    }
   
}
