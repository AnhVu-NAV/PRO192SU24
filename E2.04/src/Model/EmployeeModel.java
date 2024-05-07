/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import entities.Employee;
import entities.Manager;
import entities.SeniorManager;
import java.util.ArrayList;

/**
 *
 * @author IDEAPAD
 */
public class EmployeeModel {
    private ArrayList<Employee> employeeList;

    public EmployeeModel() {
        employeeList = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void create(Employee creatingEmployee){
        if(search(creatingEmployee)==false){
            employeeList.add(creatingEmployee);
            System.out.println("Create success!");
        }else{
            System.out.println("Create failed!");
        }
    }
    
    public boolean search (Employee creatingEmployee){
        for(Employee e: employeeList){
            if(creatingEmployee.getId().equals(e.getId())){
                return true;
            }
        }
        return false;
    }
    
    public void showAll(){
        for(Employee e: employeeList){
            System.out.println(e.toString());
        }
    }
    
    public ArrayList<Employee> list(double min, double max){
        ArrayList<Employee> list = new ArrayList<Employee>(); 
        for(Employee e: employeeList){
            if(e.calculateSalary() >= min && e.calculateSalary() <= max){
                list.add(e);
            }
        }
        return list;
    }
    
    public Employee getHighestCalculatedSalaryEmployee(){
        double max = -1e9;
        Employee rerult = null;
        for(Employee e: employeeList){
            if(e.calculateSalary() > max && e instanceof Employee){
                max = e.calculateSalary();
                rerult = e;
            }
        }
        return rerult;
    }
    
    public Employee getHighestCalculatedSalaryManager(){
        double max = -1e9;
        Employee rerult = null;
        for(Employee e: employeeList){
            if(e.calculateSalary() > max && e instanceof Manager){
                max = e.calculateSalary();
                rerult = e;
            }
        }
        return rerult;
    }
    public Employee getLowestDiscountSeniorManager(){
        double min = 1e9;
        Employee rerult = null;
        for(Employee e: employeeList){
            if(e.calculateSalary() < min && e instanceof SeniorManager){
                min = e.calculateSalary();
                rerult = e;
            }
        }
        return rerult;
    }
    
    
}
