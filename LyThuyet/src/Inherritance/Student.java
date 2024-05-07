/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inherritance;

/**
 *
 * @author IDEAPAD
 */
public class Student extends Person{
    public double avg;
    public String nameOfSchool;

    public Student() {
    }

    public Student(String id, String name, double avg, String nameOfSchool) {
        super(id, name);
        this.avg = avg;
        this.nameOfSchool = nameOfSchool;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + super.id + ", name=" + super.name + ", avg= " + this.avg 
                + ", nameOfSchool= " + this.nameOfSchool + '}';
    }
    
    
    
    
}
