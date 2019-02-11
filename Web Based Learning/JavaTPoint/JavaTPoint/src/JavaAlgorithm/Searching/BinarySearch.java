/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAlgorithm.Searching;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {16, 19, 20, 23, 45, 56, 78, 90, 96, 100}; 
        int item,location = -1; 
        System.out.println("Enter the item which you want to search");
        Scanner input = new Scanner(System.in);
        item = input.nextInt();
        location = binarySearch(arr,0,9,item);
        
        if(location !=-1){
            System.out.println("The location of the item is "+location);
        }else{
            System.out.println("Item not found");
        }
        
    }
    public static  int binarySearch(int[] a, int beg,int end,int item){
    int mid;
    if(end >= beg){
    mid = (beg+end)/2;
    
    if(a[mid]==item){
    return mid+1;
    }
    
    else if(a[mid]<item){
    return binarySearch(a, mid+1, end, item);
    }
    else{
    return binarySearch(a, beg, mid-1, item);
    }
    }
    return -1;
    }
}
