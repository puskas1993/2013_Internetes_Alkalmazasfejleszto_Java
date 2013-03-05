/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lko;

/**
 *
 * @author literati
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int m,n;
        m=3242;
        n=343;
        if(n>m){
            int l=m;
            m=n;
            n=l;
        }
        
        int k=n;
        boolean lko=true;
        
        while(lko){
            if(m%k==0){
                if(n%k==0){
                    System.out.println(k);
                    lko=false;
                }
            }
            k--;
        }
        
        
    }
}
