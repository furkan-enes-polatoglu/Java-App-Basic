import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalisanIslemleri {
	
	private Connection con = null;
	private Statement statement = null;
	private PreparedStatement prestatement = null;
	
	public ArrayList<Calisan> calisanlariGetir()
	{
		ArrayList<Calisan> cikti = new ArrayList<Calisan>();
		
		try
		{
			statement = con.createStatement();
            String sorgu ="Select * FROM calisanlar";
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next())
            {
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String dept = rs.getString("departman");
                String maas = rs.getString("maas");
                
                cikti.add(new Calisan(id, ad, soyad, dept, maas));         
            }
            return cikti;
		}
		catch (SQLException ex) {
			Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
		}
			
	}
		
	
	
	public CalisanIslemleri()
	{
		String url = "jdbc:mysql://"+Database.host+":"+Database.port+"/"+Database.db_adi+"?useUnicode=true&characterEncoding=utf8&useSSL=false";
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException ex) 
		{
			System.out.println("Driver bulunamadý!");
		}
		
		
		try
		{
			con = DriverManager.getConnection(url,Database.kullanici_adi, Database.parola);
			System.out.println("Baðlantý baþarýlý!");
		}
		catch (SQLException ex) 
		{
			System.out.println("Baðlantý baþarýsýz!");
		}
	}
	
	
	
	public boolean girisYap(String kullanici_adi, String parola)
	{
		String sorgu = "SELECT * FROM adminler where username=? and password=?";
		
		try
		{
			prestatement = con.prepareStatement(sorgu);
			prestatement.setString(1, kullanici_adi);
			prestatement.setString(2, parola);
			
			ResultSet rs = prestatement.executeQuery();
			
			return rs.next();
		}
		catch (SQLException ex) 
		{
			Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
			return false;
		}
	}
	
	public static void main(String[] args) {
        CalisanIslemleri islemler = new CalisanIslemleri();
    }
}
