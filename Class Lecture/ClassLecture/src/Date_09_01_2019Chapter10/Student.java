/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_09_01_2019Chapter10;

/**
 *
 * @author User
 */
public class Student {
    private int  studentId;
    private String studentName;
    private String mobileNo;
    private boolean isActiveStudent;
    private Department department;
public Student(){}

    public Student(int studentId, String studentName, String mobileNo, boolean isActiveStudent, Department department) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mobileNo = mobileNo;
        this.isActiveStudent = isActiveStudent;
        this.department = department;
    }


}

