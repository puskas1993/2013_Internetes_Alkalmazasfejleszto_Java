/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package madattere;

import java.util.Random;

/**
 *
 * @author literati
 */
public class Ter {
    private Madar[][] ter = new Madar[10][10];

    public Madar[][] getTer() {
        return ter;
    }

    public void setTer(Madar[][] ter) {
        this.ter = ter;
    }
    
    public void AddMadar(Madar m, int x, int y){
        this.ter[x][y]=m;
    }
    
    public void AddMadar(){
        Random rand=new Random();
        int x = rand.nextInt(10);
        int y=rand.nextInt(10);
        this.AddMadar(new Madar(),x,y);
    }
    
    public void AddMadarak(int db){
        for(int i=0; i<db; i++){
            this.AddMadar();
        }
    }

    public void Valid(){
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                if(this.ter[i][j]!=null){
                    System.out.println("["+i+":"+j+"]"+this.ter[i][j]);
                }
            }
        }
    
    }
    
    
    public void Test(){
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.print(this.ter[i][j]+",");
            }   
            System.out.println();
        }
    }
    
    
    
}
