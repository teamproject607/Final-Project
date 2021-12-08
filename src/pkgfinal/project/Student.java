/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project;

/**
 *
 * @author TRUTc
 */
public class Student extends Department{
    
    private String course;
    private int semester;

    public void setCourse(String course) {
        this.course = course;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getCourse() {
        return course;
    }

    public int getSemester() {
        return semester;
    }

    public Student(String course, int semester) {
        this.course = course;
        this.semester = semester;
    }

    public Student(){}
    
    
}
