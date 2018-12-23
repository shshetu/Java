/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_19_12;

/**
 *
 * @author User
 */
public class Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      for(int i=1;i<=20;i++){System.out.println(" "+i);}
      for(int i=1;i<=20;i++){
          if(i==5||i==10||i==15){
          continue;
    }
          System.out.println(" "+i);
    
}
      int j,sum=0;
       for(j=1;j<=20;j++){sum+=j;}
        System.out.println(sum);
  
       int k;
       for(k=1;k<=20;k++){if(k%5==0){System.out.println(k);}}
   
           int l;
           for(l=1;l<=20;l++){System.out.println("break at half:"+l);
           if(l==10){break;}
           }
    }
}
