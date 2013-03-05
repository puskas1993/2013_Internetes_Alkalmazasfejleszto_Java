/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pont;

/**
 *
 * @author literati
 */
public class Pont {
    private int x,y;

    public Pont() {
        this.setX(0);
        this.setY(0);
    }
    
    public Pont(int x, int y) {
        this.setX(x);
        this.setY(y);
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public double toOrigo(){
        return Math.sqrt(Math.pow(this.getX(), 2)
                +Math.pow(this.getY(), 2));
    }

    @Override
    public String toString() {
        return "(" + this.getX() + "," 
                + this.getY() + ")";
    }
    
    
}
