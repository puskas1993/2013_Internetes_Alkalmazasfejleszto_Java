/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package film;

/**
 *
 * @author literati
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Film f1=new Film("ALma", 76);
        Film f2=new Film("Körte");
        Film f3=new Film("Teknöcök", 25);
        Film f4=new Film("Dinnye");
        
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        
        if(f1.equals(f3)){
            System.out.println(f1+" hosszabb mint "+f3);
        }
        else{
            System.out.println(f3+" hosszabb mint "+f1);
        }
        
    }
}
