package deneme1;

    import java.util.Scanner;

        public class Deneme1 {

                public static void main(String[] args) {
                // TODO code application logic here
                Scanner yaz = new Scanner(System.in);
                int vize;
                int finall;
                double ortalama;
                    System.out.println("Vize notunu giriniz : ");
                    vize = yaz.nextInt();
                    System.out.println("Final notunu git : ");
                    finall = yaz.nextInt();
                    ortalama = vize*0.4 + finall*0.6;
                  
                    if(ortalama>=50)
                    {
                        System.out.println("geçtin");
                    }
                    else
                    {
                        System.out.println("kaldın");
                    }
                    
                    
                    
                
                
    
                            }
    
}
