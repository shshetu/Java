/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaThread;

/**
 *
 * @author User
 */
class dsdssd extends Thread{  
  @Override
  public void run(){  
   System.out.println("running...");  
  }  
 public static void main(String args[]){  
  dsdssd t1=new dsdssd();   
  dsdssd t2=new dsdssd();  
  System.out.println("Name of t1:"+t1.getName());  
  System.out.println("Name of t2:"+t2.getName());  
  System.out.println("id of t1:"+t1.getId());  
  
  t1.start();  
  t2.start();  
  
  t1.setName("Sonoo Jaiswal");  
  System.out.println("After changing name of t1:"+t1.getName());  
 }  
}  
