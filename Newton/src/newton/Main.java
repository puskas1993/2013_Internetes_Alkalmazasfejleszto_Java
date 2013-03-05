/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newton;

/**
 *
 * @author literati
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       NewtonSqrt n1=new NewtonSqrt(224342);
       System.out.println(n1);
       System.out.println();
       NewtonSqrt n2=new NewtonSqrt(224342,0.00000000001);
       System.out.println(n2);
       
    }
}
