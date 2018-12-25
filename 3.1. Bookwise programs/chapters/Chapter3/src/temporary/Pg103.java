/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporary;

/**
 *
 * @author Hp
 */
public class Pg103 {
    public static void main(String[] args) {
        int z = 3, y = 3;
        if(z+3 == 6){y=1;}
        y+=1;
        
        
        int x = 1, a = 3;
  switch(a){
    case 1: x+=5;break;
    case 2: x+=10;break;
    case 3: x+=16;break;
    case 4: x+=34;break;
    }
  int day = 1;
  switch(day){
      case 0: System.out.println("Sunday!");break;
      case 1: System.out.println("Monday!");break;
      case 2: System.out.println("Tuesday!");break;
      case 3: System.out.println("Wednesday!");break;
      case 4: System.out.println("Thursday!");break;
      case 5: System.out.println("Friday!");break;
      case 6: System.out.println("Saturday!");break;
      
  }
 /* java.util.Scanner input = new java.util.Scanner(System.in);
      double x = input.nextDouble();
      double y = input.nextDouble();
      double z = input.nextDouble();
          System.out.println((x<y && y<z) ? "sorted" : "not sorted");
   */
 int ages = 10;
int ticketPrice = (ages >= 16) ? 20 : 10;
int i = 1, j=2;
int number =2 ;
        System.out.println((number % 3 == 0) ? i:j);
        
        if(number % 3 ==0){System.out.println(i);}else{System.out.println(j);}
    
    }
}
