
package hesapmakinesi;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner yaz = new Scanner(System.in);
        int x;
        int y;
        int toplam;
        int fark;
        int carpim;
        int bolum;
        
        System.out.println("1.Sayıyı giriniz : ");
        x=yaz.nextInt();
        System.out.println("2.Sayıyı giriniz : ");
        y=yaz.nextInt();
        
        toplam=x+y;
        fark=x-y;
        carpim=x*y;
        bolum=x/y;
        
        System.out.println("Girdiğiniz sayıların, \nToplamı : " +toplam);
        System.out.println("Farkı : "+fark);
        System.out.println("Çarpımı : "+carpim);
        System.out.println("Bölümü : "+bolum);
    
        
        
        
        
        
    }
    
}
