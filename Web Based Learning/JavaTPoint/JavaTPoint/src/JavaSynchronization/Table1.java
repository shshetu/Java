/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSynchronization;


 //example of java synchronized method
public class Table1 {
    //Using synchronized method
    synchronized void printTable(int n){
    //synchronized method
        for (int i = 1; i <=5; i++) {
            System.out.println(n*i);
        }
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

//Printing the second calss extending Thread class
class MyTh1 extends Thread{
Table1 t; //declaring the object of the Table1 class
 
//creating a parameterised constructor
    public MyTh1(Table1 t) { //pass by value of type Table1 and object t
        this.t = t;
    }
    //Creating a run method
    public void run(){
    t.printTable(5);
    
    }

}
//Printing the third class extending Thread claass
class MyTh2 extends Thread{
//must create an object
    Table1 t;

    //Parameterized consturctor
    public MyTh2(Table1 t) {
   this.t = t;
    }
    @Override
    public void run(){
    t.printTable(100);
    }


}

//Printing the main method class
class TestSync{
    public static void main(String[] args) {
        Table1 obj = new Table1();
        MyTh1 t1  = new MyTh1(obj);
        MyTh2 t2  = new MyTh2(obj);
        t1.start();
        t2.start();
    }

}