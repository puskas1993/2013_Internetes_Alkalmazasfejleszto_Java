/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package henger;

/**
 *
 * @author literati
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Henger h1=new Henger(5,15);
        System.out.println(h1);
        
        TomorHenger th1=new TomorHenger(5,15,3);
        System.out.println(th1);
        
        Cso cs1=new Cso(5,15,3,2);
        System.out.println(cs1);
    }
}
