/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import entities.Employee;

/**
 *
 * @author IDEAPAD
 */
public class Manager extends Employee{
    
    private int revenue;
    private double discount;

    public Manager() {
    }

    public Manager(String id, String name, int salary, double coefficientsSalary, int revenue, double discount) {
        super(id, name, salary, coefficientsSalary);
        this.revenue = revenue;
        this.discount = discount;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + this.revenue * this.discount;
    }

    @Override
    public String toString() {
        return "Manager["+ "id=" + super.getId() + ", name=" + super.getName() + ", salary=" + super.getSalary() + 
                ", coefficientsSalary=" + super.getCoefficientsSalary() + "revenue=" + revenue + 
                ", discount=" + discount + ']';
    }
    
    
    
    
}
