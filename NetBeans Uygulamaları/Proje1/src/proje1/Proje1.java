package proje1;

import java.util.Random;
import java.util.Scanner;

public class Proje1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Random rnd = new Random();
        Scanner oku = new Scanner(System.in);
        int sayi_rnd;
        int sayi;
        sayi_rnd = rnd.nextInt(5);
        while(true)
        {
            System.out.println("Aklımdan bir sayı tuttum bir bakalım");
            sayi = oku.nextInt();
            if(sayi==sayi_rnd){
                System.out.println("Bildin!");
                break;
            }
            else
                System.out.println("Tekrar dene");
                
            
        }
        
        
        
    }
}
    
