/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package terepasztal;

/**
 *
 * @author literati
 */
public class Auto {
    private String rendszam;
    private double x,y,szog;
    
    public Auto(String rendszam, double x, double y){
        this.setRendszam(rendszam);
        this.setX(x);
        this.setY(y);
        this.setSzog(0);
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getSzog() {
        return szog;
    }

    public void setSzog(double szog) {
        this.szog = szog;
    }
    
    public void megy(int tavolsag){
        this.setX(this.getX()+(tavolsag*Math.cos(Math.toRadians(this.getSzog()))));
        this.setY(this.getY()+(tavolsag*Math.sin(Math.toRadians(this.getSzog()))));
    }
    
    public void fordul(double szog){
        double aktSzog=this.getSzog();
        aktSzog+=szog;
        if(aktSzog>360){
            aktSzog-=360;
        }
        this.setSzog(aktSzog);
    }
    
    public String toString(){
        return this.getRendszam()+":("+this.getX()+","
                +this.getY()+")-"+this.getSzog();
    }
}
