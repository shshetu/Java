/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOPSMisc;

///In case of call by value original value is not changed
public class Operation {
    int data = 50;
    void change(int data){
    data = data+100; //changes will be int the local variables only
    }
    public static void main(String[] args) {
        Operation op = new Operation();
        System.out.println("before change "+ op.data);
        op.change(500);
        System.out.println("after change "+ op.data);
    }
}
