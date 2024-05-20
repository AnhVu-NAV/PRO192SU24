/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author IDEAPAD
 */
public class Fraction extends AbstractFraction{

    public Fraction() {
    }

    public Fraction(int numer, int demon) {
        super(numer, demon);
    }

    @Override
    public AbstractFraction add(AbstractFraction f) {
        int tu = super.getNumer()* f.getDemon() + f.getNumer()* super.getDemon();
        int mau = super.getDemon() * f.getDemon();
        return new Fraction(tu, mau) ;
    }

    @Override
    public AbstractFraction minus(AbstractFraction f) {
        int tu = super.getNumer()* f.getDemon() - f.getNumer()* super.getDemon();
        int mau = super.getDemon() * f.getDemon();
        return new Fraction(tu, mau);
    }

    @Override
    public AbstractFraction time(AbstractFraction f) {
        int tu = super.getNumer() * f.getNumer();
        int mau = super.getDemon() * f.getDemon();
        return new Fraction(tu, mau);
    }

    @Override
    public AbstractFraction div(AbstractFraction f) {
        int tu = super.getNumer() * f.getDemon();
        int mau = super.getDemon() * f.getNumer();
        return new Fraction(tu, mau);
    }
    
    public int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }

    @Override
    public AbstractFraction simplify() {
        int gcd = this.gcd(super.getNumer(), super.getDemon());
        int tu = super.getNumer()/gcd;
        int mau = super.getDemon()/gcd;
        return new Fraction(tu, mau);
    }
    
}
