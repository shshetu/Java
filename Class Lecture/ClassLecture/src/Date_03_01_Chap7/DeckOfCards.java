/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_03_01_Chap7;

/**
 *
 * @author User
 */
public class DeckOfCards {
    public static void main(String[] args) {
      int[] deck = new int[52];
      for(int i= 0;i<=3;i++){
      int cardNumber = (int)(52*Math.random());
       // System.out.println("Card Number: " + cardNumber);
       int suit = cardNumber/13;
       int rank = cardNumber%13;
        switch(rank){
           case 0:System.out.print("Ace ");break;
           case 1:System.out.print("2 ");break;
           case 2:System.out.print("3 ");break;
           case 3:System.out.print("4 ");break;
           case 4:System.out.print("5 ");break;
           case 5:System.out.print("6 ");break;
           case 6:System.out.print("7 ");break;
           case 7:System.out.print("8 ");break;
           case 8:System.out.print("9 ");break;
           case 9:System.out.print("10 ");break;
           case 10:System.out.print("Jack ");break;
           case 11:System.out.print("Queen ");break;
           case 12:System.out.print("King ");break;
       }
       
       switch(suit){
           case 0: System.out.print("Spades! ");break;
           case 1: System.out.print("Heart! ");break;
           case 2: System.out.print("Diamonds! ");break;
           case 3: System.out.print("Clubs! ");break;
       
       }
          System.out.println("");
       }
    }
    
  
}
