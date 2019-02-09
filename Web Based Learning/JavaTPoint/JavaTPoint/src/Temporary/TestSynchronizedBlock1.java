/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temporary;

/**
 *
 * @author User
 */
class Table1{  
  
 void printTable(int n){  
   synchronized(this){//synchronized block  
     for(int i=1;i<=5;i++){  
      System.out.println(n*i);  
      try{  
       Thread.sleep(400);  
      }catch(Exception e){System.out.println(e);}  
     }  
   }  
 }//end of the method  
}  
  
class MyThread11 extends Thread{  
Table t;  
MyThread11(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(5);  
}  
  
}  
class MyThread12 extends Thread{  
Table t;  
MyThread12(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(100);  
}  
}  
  
public class TestSynchronizedBlock1{  
public static void main(String args[]){  
Table obj = new Table();//only one object  
MyThread11 t1=new MyThread11(obj);  
MyThread12 t2=new MyThread12(obj);  
t1.start();  
t2.start();  
}  
}
