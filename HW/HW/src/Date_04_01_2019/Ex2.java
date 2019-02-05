/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_04_01_2019;

/**
 *
 * @author shshe
 */
//Main method class
public class Ex2 {
    public static void main(String[] args) {
        //FOr Uncle class
        Uncle uncle = new Uncle();
        Thread uncleThread = new Thread(uncle);
        uncleThread.setName("Mr. Jamil");
        uncleThread.setPriority(1);
        uncleThread.start();
        
        //For Urmi class
        Urmi u = new Urmi();
        Thread urmiThread = new Thread();
        urmiThread.setName("Urmi");
        urmiThread.setPriority(10);
        urmiThread.start();
        
        ///Printing part
        System.out.println("UncleThread Name: "+ uncleThread.getName());
        System.out.println("UrmiThread Name: "+ urmiThread.getName());
        System.out.println("uncleThread Priority: "+ uncleThread.getPriority());
        System.out.println("urmiThread Priority: "+ urmiThread.getPriority());
    }
}
//Creating class urmi
class Urmi implements Runnable{
int i ;
    @Override
public void run(){
i = 0;
    while (true) {        
        System.out.println("Urmi: "+ i++); 
        if (i == 50) {
            break;
        }
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
    }
}
}

//Creating class Uncle
class Uncle implements Runnable{
int i ;
@Override
public void run(){
i =0;
    while (true) {        
        System.out.println("Uncle: "+ i++);
        if (i==50) {
            break;
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }
}

}
