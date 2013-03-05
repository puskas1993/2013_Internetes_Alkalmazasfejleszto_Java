/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lnko;

/**
 *
 * @author literati
 */
public class LNKO {
    private double m,n,r;
    
    public LNKO(double m, double n){
        this.setM(m);
        this.setN(n);
        this.Csere();
        this.setR(this.getM()%this.getN());
    }
    
    public void Csere(){
        if(this.getN()>this.getM()){
            double c=this.getN();
            this.setN(this.getM());
            this.setM(c);
        }
    }
    
    public void Szamol(){
        while(this.getR()!=0){
            this.setM(this.getN());
            this.setN(this.getR());
            this.setR(this.getM()%this.getN());
            System.out.println(this);
        }
    }
    
    @Override
    public String toString(){
        return "M:"+this.getM()+
                ", N:"+this.getN()+
                ", R:"+this.getR();
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    
}
