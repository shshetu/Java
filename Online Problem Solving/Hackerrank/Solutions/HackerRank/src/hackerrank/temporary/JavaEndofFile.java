/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.temporary;

import java.util.Scanner;

/**
 *
 * @author shshe
 */
public class JavaEndofFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; input.hasNextLine(); i++) {
            System.out.println(i+" "+input.nextLine());
        }
        input.close();
    }
}
