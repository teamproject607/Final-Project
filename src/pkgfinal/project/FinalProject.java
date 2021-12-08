/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project;

import java.awt.Label;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
/**
 *
 * @author TRUTc
 */
public class FinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        Teacher t3 = new Teacher();
        
        Staff st1 = new Staff();
        
        System.out.println("------------------------------------------------");
        System.out.println("Choose one of the following options:");
        System.out.println("Press 1");
        int i = scan.nextInt();
        switch(1){
            case 1:
            System.out.println("Create new Student:");
            System.out.println("");
            
            
                
            
            try (FileOutputStream fos = new FileOutputStream("object.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                
                
                
                s1.add("John Doe", "john.doe@example.com",
                new String[]{"Member", "Admin"}, true);
                oos.writeObject(s1);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
                break;
            case 2:
                try (FileOutputStream fos = new FileOutputStream("object.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                
                System.out.println("Create new Teacher:");
                
                s1.add("John Doe", "john.doe@example.com",
                new String[]{"Member", "Admin"}, true);
                oos.writeObject(s1);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
                
                break;
        }
        
        
        
        
        
        String s = time.split(i);
        s[0] = id;
        
        department d = new department();
        for(department d: deptList){
            if(d.getId()== s[3]){
                d.studentlist.add(new Student());
                
            }
        
        System.out.println("Choose one of the following options:");
        int choice = scan.nextInt();
     }
    }
    public boolean assignStudent(ArrayList <Department> arraydep, Student s, int id){
        for(Department d: arraydep){
            if(d.getId()== id){
                d.StudentList.add(s);
                return true;
            }
            return false;
        }
    }
    if(assignStudent){
    Label.setText("Student successfully added!");
    }
    else{
    Label.setText("Student not added.");
}
}
    

