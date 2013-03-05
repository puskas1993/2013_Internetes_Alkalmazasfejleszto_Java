/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package henger;

/**
 *
 * @author literati
 */
public class Cso extends TomorHenger{
    private double falVastagsag;

    public Cso(double sugar, double magassag, double fajsuly,double falVastagsag) {
        super(sugar, magassag, fajsuly);
        this.setFalVastagsag(falVastagsag);
    }

    public double getFalVastagsag() {
        return falVastagsag;
    }

    public void setFalVastagsag(double falVastagsag) {
        this.falVastagsag = falVastagsag;
    }

    @Override
    public double terfogat() {
        Henger h1_Kulso=
                new Henger(super.getSugar(),
                            super.getMagassag());
        Henger h2_Belso=
                new Henger(super.getSugar()-
                            this.getFalVastagsag(),
                                super.getMagassag());
        
        return h1_Kulso.terfogat()-h2_Belso.terfogat();
    }
    
    public String toString(){
        return super.toString()+
                ", Falvastagsag:"+this.getFalVastagsag();
    }
    
    
    
    
}
