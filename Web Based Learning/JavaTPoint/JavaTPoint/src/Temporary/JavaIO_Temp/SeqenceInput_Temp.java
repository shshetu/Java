package Temporary.JavaIO_Temp;


import java.io.FileInputStream;
import java.io.SequenceInputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shshe
 */
public class SeqenceInput_Temp {
    public static void main(String[] args) {
        try {
            FileInputStream input1 = new FileInputStream("D:\\test.txt");
            FileInputStream input2 = new FileInputStream("D:\\test1.txt");
            SequenceInputStream inst = new SequenceInputStream(input1,input2);
            int j;
            while((j= inst.read())!=-1){
                System.out.println((char)j);
            }
            inst.close();
            input1.close();
            input2.close();
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
