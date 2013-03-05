/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package terepasztal;

/**
 *
 * @author literati
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto A1=new Auto("AAA-111", 0,0);
        Auto A2=new Auto("AAA-222", 5,1);
        System.out.println(A1);
        A1.fordul(90);
        System.out.println(A1);
        A1.megy(10);
        A2.megy(10);
        System.out.println(A1);
        System.out.println(A2);
        
        
        
        
    }
}
