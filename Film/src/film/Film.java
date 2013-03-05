/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package film;

/**
 *
 * @author literati
 */
public class Film {
    private String nev;
    private int perc;

    public Film(String nev, int perc) {
        this.setNev(nev);
        this.setPerc(perc);
    }

    public Film(String nev) {
        this.setNev(nev);
        this.setPerc(0);
    }
    
    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getPerc() {
        return perc;
    }

    public void setPerc(int perc) {
        this.perc = perc;
    }

    @Override
    public String toString() {
        return "Film{" + "nev=" + this.getNev() 
               + ", perc=" + this.getPerc() + '}';
    }

    public boolean equals(Film f){
        if(this.getPerc()>f.getPerc()){
            return true;
        }
            return false;
   }
    
    
}
