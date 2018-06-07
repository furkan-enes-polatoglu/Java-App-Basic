package metotCagirma;

public class kurucuMetot {
    
    public kurucuMetot() {
        System.out.println("Parametresiz metot");    
    }
    public kurucuMetot(String a, int b) {   
        System.out.println("Bir parametreli metot geldi : "+a+ ", Kaç tane geldi : "+b);
    }
    public kurucuMetot(int a, int b) {       
        System.out.println("İki parametreli metot çarpımı : "+ a*b);
    }
}
