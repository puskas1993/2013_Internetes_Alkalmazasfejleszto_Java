/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numbsum;

/**
 *
 * @author literati
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=13;
        int i;
        
        while(n>0){
            i=2;
            while(n%i!=0){
                i++;
            }
             System.out.println(i);
             n/=i;
        }
       
    }
}
