/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sikodom;

/**
 *
 * @author literati
 */
public class Negyzet {
   private double a;
   
   public Negyzet(double a){
       this.setA(a);
   }
   
   public void setA(double a){
       this.a=a;
   }
   
   public double getA(){
       return this.a;
   }
   
   public double Terulet(){
       return this.getA()*this.getA();
   }
   
   public double Kerulet(){
       return 4*this.getA();
   }
   
   public String toString(){
       return "Terulet:"+this.Terulet()+
               ",Kerulet:"+this.Kerulet();
   }
}
