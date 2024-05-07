/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import entities.Manager;

/**
 *
 * @author IDEAPAD
 */
public class SeniorManager extends Manager{
    private double bonusRate;

    public SeniorManager() {
    }

    public SeniorManager(String id, String name, int salary, double coefficientsSalary, int revenue, double discount,double bonusRate) {
        super(id, name, salary, coefficientsSalary, revenue, discount);
        this.bonusRate = bonusRate;
    }

    public double getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + super.getRevenue() * super.getDiscount() * this.bonusRate;
    }

    @Override
    public String toString() {
        return "SeniorManager[" + "id=" + super.getId() + ", name=" + super.getName() + ", salary=" + super.getSalary() + 
                ", coefficientsSalary=" + super.getCoefficientsSalary() + "revenue=" + super.getRevenue() + 
                ", discount=" + super.getDiscount() + "bonusRate=" + bonusRate + ']';
    }
    
    
    
}
