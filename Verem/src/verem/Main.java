/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package verem;

/**
 *
 * @author literati
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Verem v1=new Verem(10);
        System.out.println(v1);
        v1.push(4);
        System.out.println(v1);
        v1.push(5);
         System.out.println(v1);
         v1.push(23);
         System.out.println(v1);
         v1.top();
         System.out.println(v1.pop());
          System.out.println(v1);
          v1.push(45);
          System.out.println(v1);
         
    }
}
