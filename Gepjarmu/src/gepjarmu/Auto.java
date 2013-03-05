/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gepjarmu;

/**
 *
 * @author literati
 */
public class Auto extends Gepjarmu{
    private String rendszam;
    private String alvazszam;
    private double benzinTartaly;
    private double benzinMennyiseg;

    public Auto(String rendszam, String alvazszam, double benzinTartaly, double benzinMennyiseg, int kerekszam, int loero, double fogyasztas) {
        super(kerekszam, loero);
        this.setRendszam(rendszam);
        this.setAlvazszam(alvazszam);
        this.setBenzinTartaly(benzinTartaly);
        this.setBenzinMennyiseg(benzinMennyiseg);
        super.setFogyasztas(fogyasztas);
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public String getAlvazszam() {
        return alvazszam;
    }

    public void setAlvazszam(String alvazszam) {
        this.alvazszam = alvazszam;
    }

    public double getBenzinTartaly() {
        return benzinTartaly;
    }

    public void setBenzinTartaly(double benzinTartaly) {
        this.benzinTartaly = benzinTartaly;
    }

    public double getBenzinMennyiseg() {
        return benzinMennyiseg;
    }

    public void setBenzinMennyiseg(double benzinMennyiseg) {
        this.benzinMennyiseg = benzinMennyiseg;
    }

    public boolean Megy(double km){
        if((super.getFogyasztas()/100)*km<=this.getBenzinMennyiseg()){
            double fogy=(super.getFogyasztas()/100)*km;
            this.setBenzinMennyiseg(this.getBenzinMennyiseg()-fogy);
            return true;
        }
        return false;
    }
    
    public boolean Tankol(double liter){
        if(this.getBenzinMennyiseg()+liter<=this.getBenzinTartaly()){
            this.setBenzinMennyiseg(this.getBenzinMennyiseg()+liter);
            return true;
        }
        return false;
    
    }
    
    @Override
    public String toString() {
        return super.toString()+
                ","+this.getAlvazszam()+
                ","+this.getRendszam()+
                ","+this.getBenzinMennyiseg()+
                ","+this.getBenzinTartaly();
    }
    
    
}
