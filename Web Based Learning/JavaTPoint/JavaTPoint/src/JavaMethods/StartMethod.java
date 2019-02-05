/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMethods;

/**
 *
 * @author User
 */
public class StartMethod {
    
}
/////////////////////////////////////
//    class StartExp3 extends Thread  
//    {    
//        public void run()  
//        {    
//        System.out.println("First thread running...");    
//        }    
//        public static void main(String args[])  
//        {    
//            StartExp3 t1=new StartExp3();    
//            t1.start();    
//            // It will through an exception because you are calling start() method more than one time   
//          //  t1.start();    
//        }    
//    }    
//////////////////////////////////
     class SleepExp1 extends Thread  
    {    
        public void run()  
        {    
            for(int i=1;i<5;i++)  
            {    
                try  
                {  
                    Thread.sleep(2000);  
                }catch(InterruptedException e){System.out.println(e);}    
                System.out.println(i);    
            }    
        }    
        public static void main(String args[])  
        {    
            SleepExp1 t1=new SleepExp1();    
            SleepExp1 t2=new SleepExp1();    
            t1.start();    
            t2.start();    
        }    
    }  