/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package verem;

/**
 *
 * @author literati
 */
public class Verem {
    private int[] Verem;
    private int mely;
    private int mt;

    public Verem(int mely) {
        this.setMely(mely);
        this.Verem = new int[this.getMely()];
        this.setMt(0);
    }

    public int getMely() {
        return mely;
    }

    public void setMely(int mely) {
        this.mely = mely;
    }

    public int getMt() {
        return mt;
    }

    public void setMt(int mt) {
        if(mt<this.getMely() || mt>=0){
            this.mt = mt;
        }
    }
    
    public int pop(){
        this.setMt(this.getMt()-1);
        return this.Verem[this.getMt()];
    }
    
    public void push(int szam){
        this.Verem[this.getMt()]=szam;
        this.setMt(this.getMt()+1);   
    }
    
    public void top(){
        System.out.println(
                this.Verem[this.getMt()-1]);
    }
    
    public String toString(){
        String verem="---- ----\n";
        for(int i=this.getMt()-1; i>=0; i--){
            verem+=this.Verem[i]+"\n";
        }   
        return verem;      
    }
    
    
}
