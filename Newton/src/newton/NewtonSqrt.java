/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newton;

/**
 *
 * @author literati
 */
public class NewtonSqrt {
    
    private int A;
    private double X1; // Xn
    private double X2; // Xn+1
    private double v;

    public NewtonSqrt(int A){
        this.setA(A);
        this.setV(0.0001);
        this.setX1(A/2);
        this.Szamol();
    }
    // Felüldef. Overloading
     public NewtonSqrt(int A,double v){
        this.setA(A);
        this.setV(v);
        this.setX1(A/2);
        this.Szamol();
    }
    
    public void Szamol(){
        this.setX2((this.getX1()+
                (this.getA()/this.getX1()))/2);
        System.out.println("X1:"+this.getX1());
        System.out.println("X2:"+this.getX2());
        if(!this.Vizsgalat()){
            this.setX1(this.getX2());
            this.Szamol();
        }
    }
    
    public boolean Vizsgalat(){
        double v=Math.abs(this.getX2()-this.getX1());
         System.out.println("V:"+v);
        if(v>=this.getV()){
            return false;
        }
        return true;
    }
    
    public String toString(){
        return "Gyök:"+this.getX2();
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }
    
    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public double getX1() {
        return X1;
    }

    public void setX1(double X1) {
        this.X1 = X1;
    }

    public double getX2() {
        return X2;
    }

    public void setX2(double X2) {
        this.X2 = X2;
    }
    
    
    
}
