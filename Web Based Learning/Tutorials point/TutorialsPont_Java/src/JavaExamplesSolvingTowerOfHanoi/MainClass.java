/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExamplesSolvingTowerOfHanoi;

/**
 *
 * @author User
 */
public class MainClass {
static int count =0;
    ///Customized class
    public static void doTowers(int topN,char from,char inter,char to){
        if (topN == 1) {
            count++;
            System.out.println("Disk 1 from "+ from + " to "+ to);
        }else{
        doTowers(topN - 1,from,to,inter);
        count++;
            System.out.println("Disk "+ topN+ " from "+ from + " to "+ to);
            doTowers(topN -1,inter,from,to);
        }
    
    }
    
    
    
//Main Method
    public static void main(String[] args) {
        int nDisks = 3;
        doTowers(nDisks,'A','B','C');
        System.out.println("Total number of steps: "+ count);
    }
}
