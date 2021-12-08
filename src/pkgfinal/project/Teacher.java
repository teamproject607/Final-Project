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
public class Teacher extends Department implements PayRoll{

    public Teacher(String specialty, String degree) {
        this.specialty = specialty;
        this.degree = degree;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getDegree() {
        return degree;
    }
    
    private String specialty;
    private String degree;
    
    public Teacher(){}

    @Override
    public double computePayRoll(double ) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
