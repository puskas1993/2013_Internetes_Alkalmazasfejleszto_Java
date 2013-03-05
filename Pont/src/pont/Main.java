package pont;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Pont[] Ponts=new Pont[20];
        Random rand=new Random();
       
        for(int i=0; i<20; i++){
            int x=rand.nextInt()%100;
            int y=rand.nextInt()%100;
            Ponts[i]=new Pont(x,y);
        }
        
        for(int i=0; i<20; i++){
            System.out.println(i+":"+Ponts[i]);
            System.out.println(Ponts[i].toOrigo());
        }
    }
}
