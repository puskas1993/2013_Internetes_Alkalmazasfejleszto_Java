/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package masodfoku;

/**
 *
 * @author literati
 */
public class Masodfoku {
    private int a,b,c;

    public Masodfoku(int a, int b, int c) {
        this.setA(a);
        this.setB(b);
        this.setC(c);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public double getD(){
        return Math.pow(this.getB(), 2)-
                (4*this.getA()*this.getC());
    }
    
    public int getValosMegoldasokSzama(){
        if(this.getD()>0){return 2;}
        if(this.getD()==0){return 1;}
        if(this.getD()<0){return 0;}
        return -1;
    }
    
    public double getX1(){
        return ((this.getB()*-1)+Math.sqrt(this.getD()))
                /(2*this.getA());
    }
    
    public double getX2(){
        return ((this.getB()*-1)-Math.sqrt(this.getD()))
                /(2*this.getA());
    }

    @Override
    public String toString() {
        if(this.getValosMegoldasokSzama()==2){
            return this.getX1()+","+this.getX2();
        }
        if(this.getValosMegoldasokSzama()==1){
            return this.getX1()+"";
        }
        if(this.getValosMegoldasokSzama()==0){
            return "Nincs megoldás!";
        }
        
        return "";
        
    }
     
}
