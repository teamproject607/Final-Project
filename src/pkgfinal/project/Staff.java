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
public class Staff extends Department implements PayRoll{

    public Staff(){} 
    
    public Staff(String duty, int workload) {
        this.duty = duty;
        this.workload = workload;
    }

     private String duty;
    private int workload;
    
    public void setDuty(String duty) {
        this.duty = duty;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    public String getDuty() {
        return duty;
    }

    public int getWorkload() {
        return workload;
    }
    @Override

    @Override
    public double computePayRoll(double ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
