/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author shshe
 */
public class SeatingArrangement {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); //108
        int mid ;
        for (int i = 1; i <= num; i++) {
            for (int j = i; j <=i+2; j++) {
                mid = (j+(j+1));
            }
        }
    }
}
