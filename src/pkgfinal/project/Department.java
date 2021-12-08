/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project;

import java.util.ArrayList;

/**
 *
 * @author TRUTc
 */
public class Department {
    
    private int id;
    private String description;
    private Teacher dean;
    private ArrayList <Teacher> TeacherList;
    private ArrayList <Student> StudentL;
    private ArrayList <Staff> StaffL;

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDean(Teacher dean) {
        this.dean = dean;
    }

    public void setTeacherList(ArrayList<Teacher> TeacherList) {
        this.TeacherList = TeacherList;
    }

    public void setStudentL(ArrayList<Student> StudentL) {
        this.StudentL = StudentL;
    }

    public void setStaffL(ArrayList<Staff> StaffL) {
        this.StaffL = StaffL;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Teacher getDean() {
        return dean;
    }

    public ArrayList<Teacher> getTeacherList() {
        return TeacherList;
    }

    public ArrayList<Student> getStudentL() {
        return StudentL;
    }

    public ArrayList<Staff> getStaffL() {
        return StaffL;
    }
    
    
    public Department(){}
    
    public Department(int id, String description, Teacher dean, ArrayList<Teacher> TeacherList, ArrayList<Student> StudentL, ArrayList<Staff> StaffL) {
        this.id = id;
        this.description = description;
        this.dean = dean;
        this.TeacherList = TeacherList;
        this.StudentL = StudentL;
        this.StaffL = StaffL;
    }
   
}
