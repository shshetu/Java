/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author shshe
 */
//
public class JavaSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        List<Stud> studentList = new ArrayList<Stud>();
        while(testCases>0){
        int id = in.nextInt();
        String fname = in.next();
        double cgpa = in.nextDouble();
        
        Stud st = new Stud(id, fname, cgpa);
        studentList.add(st);
        testCases--;
        }
        for(Stud s:studentList){
            System.out.println(s.getFname());
        }
    }
}
///COmplete the code


class Stud {

    private int id;
    private String fname;
    private double cgpa;

    public Stud(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    
}
