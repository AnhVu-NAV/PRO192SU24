/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import entities.Employee;
import Model.EmployeeModel;
import java.util.ArrayList;

/**
 *
 * @author IDEAPAD
 */
public class EmployeeController {
    private EmployeeModel employeeModel;

    public EmployeeController() {
        employeeModel = new EmployeeModel();
    }

    public EmployeeController(EmployeeModel employeeModel) {
        this.employeeModel = employeeModel;
    }

    public EmployeeModel getEmployeeModel() {
        return employeeModel;
    }

    public void setEmployeeModel(EmployeeModel employeeModel) {
        this.employeeModel = employeeModel;
    }
    
    public void create(Employee creatingEmployee){
        employeeModel.create(creatingEmployee);
    }
    
    public void showAll(){
        employeeModel.showAll();
        
    }
    
    public ArrayList<Employee> getEmployeeListByCalculatedSalaryInRange(double min, double max){
        return employeeModel.list(min, max);
    }
    
    public Employee getHighestCalculatedSalaryEmployee(){
        return employeeModel.getHighestCalculatedSalaryEmployee();
    }
    
    public Employee getHighestCalculatedSalaryManager(){
        return employeeModel.getHighestCalculatedSalaryManager();
    }
    
    public Employee getLowestDiscountSeniorManager(){
        return employeeModel.getLowestDiscountSeniorManager();
    }
}

