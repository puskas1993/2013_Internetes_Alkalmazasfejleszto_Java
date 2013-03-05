/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package henger;

/**
 *
 * @author literati
 */
public class TomorHenger extends Henger{
    private double fajsuly;

    public TomorHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.setFajsuly(fajsuly);
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public void setFajsuly(double fajsuly) {
        this.fajsuly = fajsuly;
    }
    
    public double suly(){
        return super.terfogat()*this.getFajsuly();
    }
    
    public String toString(){
        return super.toString()+
                ", Fajsúly:"+this.getFajsuly()+
                ", Súly:"+this.suly();
    }   
    
}
