package if_else_hesap_makinesi;

import java.util.Scanner;

public class hes_mak {
    
    public static void main (String[] args) {
     Scanner oku = new Scanner(System.in);
     int islem;
        System.out.println("Yapacağınız işlemi seçiniz...");
        System.out.println("1:Toplama - 2:Çıkarma - 3:Çarpma - 4:Bölme");
        islem = oku.nextInt();
        int sayi1;
        System.out.print("1.Sayıyı giriniz : ");
        sayi1=oku.nextInt();
        int sayi2;
        System.out.print("2.Sayıyı giriniz : ");
        sayi2=oku.nextInt();
        if(islem==1)
            System.out.println("Sonuç : "+(sayi1+sayi2));
        if(islem==2)
            System.out.println("Sonuç : "+(sayi1-sayi2));
        if(islem==3)
            System.out.println("Sonuç : "+(sayi1*sayi2));
        if(islem==4)
            System.out.println("Sonuç : "+(sayi1/sayi2));
        
        
        
        
        
    }
}