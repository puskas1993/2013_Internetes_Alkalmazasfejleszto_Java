/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fibon;

/**
 *
 * @author literati
 */
public class FiboN {

    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) {
       int a=6, b=2,c,e,j;
       if(a>b){c=a;a=b;b=c;}
       
       for(int i=a; i<=b; i++){ 
         e=1;
            for(j=i; j>0; j--){
                e*=j;
            }
         System.out.println(e);
       }
    }
}
