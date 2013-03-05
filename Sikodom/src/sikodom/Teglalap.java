/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sikodom;

/**
 *
 * @author literati
 */
public class Teglalap {
    private double a;
    private double b;

    public Teglalap(double a, double b) {
        this.setA(a);
        this.setB(b);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    public double Terulet(){
       return this.getA()*this.getB();
    }
   
   public double Kerulet(){
       return 2*(this.getA()+this.getB());
   }

    public String toString() {
        return "Terulet:"+this.Terulet()+
               ",Kerulet:"+this.Kerulet();
    }
    
    
}
