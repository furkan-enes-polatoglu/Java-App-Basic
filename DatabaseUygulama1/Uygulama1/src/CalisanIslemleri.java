
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CalisanIslemleri {
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement=null;

    public   ArrayList<Calisan> calisanlariGetir(){
        ArrayList<Calisan> cikti = new ArrayList<Calisan>();
        
        try {
            statement = con.createStatement();
            String sorgu ="Select * FROM calisanlar";
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String dept = rs.getString("departman");
                String maas = rs.getString("maas");
                
                cikti.add(new Calisan(id, ad, soyad, dept, maas));
                            
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    public CalisanIslemleri() {
        String url ="jdbc:mysql://"+Database.host+":"+Database.port+"/"+Database.db_adi+ "?useUnicode=true&characterEncoding=utf8";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı...");
        }
        
        try {
            con = DriverManager.getConnection(url,Database.kullanici_adi,Database.parola);
            System.out.println("Bağlantı Başarılı");
        } catch (SQLException ex) {
            ex.printStackTrace();
            //System.out.println("Bağlantı Başarısız...");
        }
        
    }
    
    
    
    public boolean girisYap(String kullanici_adi,String parola){
        String sorgu = "SELECT * FROM adminler where username=? and password=?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1,kullanici_adi);
            preparedStatement.setString(2,parola);
            
            ResultSet rs = preparedStatement.executeQuery();
        
            return rs.next(); //true ya da false döner
        } 
        catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
         return false;
        }
    }
    public static void main(String[] args) {
        CalisanIslemleri islemler = new CalisanIslemleri();
    }
}
