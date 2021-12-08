/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project;

import java.util.Scanner;

/**
 *
 * @author TRUTc
 */
public interface PayRoll {
    public static double computePayRoll(double salary, String specialty, int workload){
        Scanner scan = new Scanner(System.in);
        int saldegree = 0;
        System.out.println("Press <t> if Teacher, Press <s> if Staff.");
        String option = scan.nextLine();
        if(option.equals("t") || option.equals("T")){
        if(specialty.equals("PhD") ){
            saldegree = 112;
        }else{
            if(specialty.equals("Master")){
                saldegree = 82;
            }else{
                if(specialty.equals("Bachelor")){
                    saldegree = 42;
                }
            }
        }
        salary =  (36 * saldegree * 2) * 0.76;
        }else if(option.equals("s") || option.equals("S")){
            if(workload >= 36){
                System.out.println("The workload is too high.");
            }else{
                salary =  (workload * 32 * 2) * 0.85;
            }  
        }
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                egree * 2) * 0.76;
        return salary;
    }
}
