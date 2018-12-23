/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permanent_ch3;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class pg98Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int money1=10_000,money2=3_000,money3=1_000,money4=-100,total=0;
          System.out.print("How many times you want to play? :");
        int play_time = input.nextInt();
          for(int i=1;i<=play_time;i++){
        System.out.println("Input 2 digit your guess:");   
        int input_num = input.nextInt();
      
        int sys_num = (int)(100*Math.random());
        int i1 = (int)(input_num/10);
        int i2 = (int)(input_num%10);
        int s1 = (int)(sys_num/10);
        int s2 = (int)(sys_num%10);
     
          System.out.println("System generated number:"+sys_num);
        if(input_num==sys_num){System.out.print("Congratulations you earned:$"+money1);
        total+=money1;
            System.out.println("your amount is now:"+total);
        }
        else if( (i1==s1||i1==s2) && (i2==s1||i2==s2)){
            System.out.println("Congratulations you earned:$"+money2);
        total+=money2; 
        System.out.println("your amount is now:"+total);

        }
        else if( (i1==s1||i1==s2) || (i2==s1||i2==s2)){
            System.out.println("Congratulations you earned:$"+money3);
            total+=money3; 
        System.out.println("your amount is now:"+total);
        }
        else{
        System.out.println("Sorry you are fined:$"+money4);
            total+=money4; 
        System.out.println("your amount is now:"+total);
        }
        
       }
    }
 
}
