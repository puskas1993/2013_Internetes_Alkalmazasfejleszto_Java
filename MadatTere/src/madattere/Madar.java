/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package madattere;

import java.util.Random;

/**
 *
 * @author literati
 */
public class Madar {
    private int vektor;

    public Madar() {
        this.setVektor();
    }

    
    public int getVektor() {
        return vektor;
    }

    public void setVektor() {
        Random r=new Random();
        this.vektor=r.nextInt(7)+1;
    }

    @Override
    public String toString() {
        return "Csip - Csip :"+this.getVektor();
    }  
}
