import java.sql.*;

public class Baglan {
	
	private String host = "localhost";
	private int port = 3306;
	private String kullanici_adi = "root";
	private String sifre = "";
	private String veritabani = "demo2";
	
	private Connection con = null;
	private Statement statement = null;  // Nesne, statik bir SQL deyimini yürütmek ve ürettiði sonuçlarý döndürmek için kullanýlýr.
	private PreparedStatement preStatement = null;  //Önceden derlenmiþ bir SQL deyimini temsil eden bir nesne.
	
	public Baglan() 
	{
		String url = "jdbc:mysql://"+host+":"+port+"/"+veritabani+"?useUnicode=true&characterEncoding=utf8&useSSL=false";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e) 
		{
			System.out.println("Driver Bulunamadý!");
		}
		
		try 
		{
			con = DriverManager.getConnection(url, kullanici_adi, sifre);
			System.out.println("Baðlantý baþarýlý!");
		}
		catch(SQLException ex) 
		{
			System.out.println("Baðlantý baþarýsýz!");
			//ex.printStackTrace(); //Hatanýn ekrana yazýlmasýný saðlar
		}	
	}
	
	public void calisanlariGetir(int id) {
		String sorgu = "SELECT * FROM calisanlar WHERE id > ?";  // id(?)'den itibaren getir.
		try 
		{
			preStatement = con.prepareStatement(sorgu);
			preStatement.setInt(1, id);
						
			ResultSet rs = preStatement.executeQuery();
			
			while(rs.next()) 
			{
				String no = rs.getString("id");
				String ad = rs.getString("adi");
				String soyad = rs.getString("soyadi");
				String email = rs.getString("email");
				
				System.out.println("No: "+no+"\tAd: " + ad + "\tSoyad: " + soyad + "\tEmail: " + email);
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void calisanlariGuncelle() {
		try 
		{
			statement = con.createStatement();
			String sorgu = "Update calisanlar SET email='info@gmail.com'";
			statement.executeUpdate(sorgu);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void calisanSil(int id) {
		
		try 
		{
			statement = con.createStatement();
		    String sorgu = "Delete from calisanlar where id="+id;
		    int deger = statement.executeUpdate(sorgu);
		    System.out.println(deger + " tane kayýt silindi!"); 		    
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

	public void calisanEkle(String ad, String soyad, String email) {
		try 
		{
			
			statement = con.createStatement();
			String sorgu = "insert into calisanlar(adi,soyadi,email) values('"+ ad +"', '"+ soyad +"', '"+ email +"')";
			if(!statement.execute(sorgu)) //Sorgu sonuç veriyorsa
			{
				System.out.println("Kayýt eklendi!");
			}
			else 
			{
				System.out.println("Kayýt eklenemedi!");
			}
		}
		catch(SQLException ex) 
		{
			ex.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		Baglan baglanti = new Baglan();  //Nesne ile beraber kurucu metotta çaðýrýlýr
		baglanti.calisanlariGetir(0);
		System.out.println("--------------------------------------");
		
		/*baglanti.calisanEkle("deneme", "deneme", "berkkirgiz@gmail.com");
		System.out.println("-----------------------------------------------------------------");
		baglanti.calisanlariGetir(0);*/
		
		/*baglanti.calisanlariGuncelle();
		System.out.println("-------------------------------------------------------------");
		baglanti.calisanlariGetir(0);*/
		
		/*baglanti.calisanSil(14);
		baglanti.calisanlariGetir(0);*/
	}
}
