/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gepjarmu;

/**
 *
 * @author literati
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Gepjarmu g1=new Gepjarmu(4,72);
       g1.setFogyasztas(7.2);
       g1.setSebesseg(132);
       g1.setSzemelyszam(3);
       System.out.println(g1);
       
       Auto ford=new Auto("FFG-234","WASW232433432424",40.0,40.0,4,80,7.2);
       System.out.println(ford);
       ford.Megy(120);
       System.out.println(ford);
       ford.Tankol(30);
       System.out.println(ford);
      
        
        
        
    }
}
