/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavatpointInterviewQuestions;

/**
 *
 * @author shshe
 */
public class ThisKeywordStaticMembers {
    static int i = 10;
    public ThisKeywordStaticMembers(){
        System.out.println(this.i);
    }
    public static void main(String[] args) {
        ThisKeywordStaticMembers t = new ThisKeywordStaticMembers();
    }
}
