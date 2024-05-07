/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controller.EmployeeController;
import entities.Employee;
import entities.Manager;
import entities.SeniorManager;
import java.util.ArrayList;

/**
 *
 * @author IDEAPAD
 */
public class main {
    public static void main(String[] args) {
        EmployeeController eo = new EmployeeController();
		
		eo.create(new Employee("01", "A", 500, 0.5));
		eo.create(new Employee("02", "B", 300, 0.6));
		eo.create(new Employee("03", "C", 800, 0.8));
		eo.create(new Manager("04", "D", 300, 0.4, 100, 0.3));
		eo.create(new Manager("05", "E", 350, 0.4, 250, 0.14));
		eo.create(new Manager("06", "F", 650, 0.6, 130, 0.23));
		eo.create(new SeniorManager("07", "G", 500, 0.2, 230, 0.46, 0.24));
		eo.create(new SeniorManager("08", "H", 400, 0.4, 400, 0.2, 0.3));
		eo.create(new SeniorManager("09", "K", 600, 0.6, 300, 0.33, 0.43));
		eo.create(new Manager("01", "S", 870, 0.2, 400, 0.44));
		
		eo.showAll();
		System.out.println();
		
		ArrayList <Employee> list1 = eo.getEmployeeListByCalculatedSalaryInRange(400, 600);
		for(Employee emp: list1) {
			System.out.println(emp);
		}
		System.out.println();
		
		Employee emp1 = eo.getHighestCalculatedSalaryEmployee();
		System.out.println(emp1);
		System.out.println();
		
		Employee emp2 = eo.getHighestCalculatedSalaryManager();
		System.out.println(emp2);
		System.out.println();
		
		Employee emp3 = eo.getLowestDiscountSeniorManager();
		System.out.println(emp3);
		System.out.println();
    }
}
