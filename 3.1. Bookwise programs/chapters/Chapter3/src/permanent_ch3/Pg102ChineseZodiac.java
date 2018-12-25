/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permanent_ch3;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class Pg102ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year you born:");
        int year = input.nextInt();
        switch(year%12){
            case 1: System.out.println("monkey");break;
            case 2: System.out.println("rooster");break;
            case 3: System.out.println("dog");break;
            case 4: System.out.println("pig");break;
            case 5: System.out.println("rat");break;
            case 6: System.out.println("ox");break;
            case 7: System.out.println("tiger");break;
            case 8: System.out.println("rabbit");break;
            case 9: System.out.println("draggon");break;
            case 10: System.out.println("snake");break;
            case 11: System.out.println("horse");break;
            case 12: System.out.println("sheep");break;
        }
    }
}
