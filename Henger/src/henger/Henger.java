/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package henger;

/**
 *
 * @author literati
 */
public class Henger {
    private double sugar;
    private double magassag;

    public Henger(double sugar, double magassag){
        this.setSugar(sugar);
        this.setMagassag(magassag);
    }
    
    public double terfogat(){
        return Math.pow(this.getSugar(), 2)*
                Math.PI*this.getMagassag();
    }
    
    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getMagassag() {
        return magassag;
    }

    public void setMagassag(double magassag) {
        this.magassag = magassag;
    }
    
    public String toString(){
        return "Magasság:"+this.getMagassag()+
                ", Sugár:"+this.getSugar()+
                ", Térfogat:"+this.terfogat();
    }
    
    
}
