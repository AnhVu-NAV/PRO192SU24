/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author IDEAPAD
 */
public abstract class AbstractFraction {
    private int numer;
    private int demon;

    public AbstractFraction() {
    }

    public AbstractFraction(int numer, int demon) {
        this.numer = numer;
        this.demon = demon;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public int getDemon() {
        return demon;
    }

    public void setDemon(int demon) {
        this.demon = demon;
    }

    @Override
    public String toString() {
        return "AbstractFraction[" + "numer=" + numer + ", demon=" + demon + ']';
    }
    
    public abstract AbstractFraction add(AbstractFraction f);
    public abstract AbstractFraction minus(AbstractFraction f);
    public abstract AbstractFraction time(AbstractFraction f);
    public abstract AbstractFraction div(AbstractFraction f);
    public abstract AbstractFraction simplify();
    
}
