import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class GirisEkraný extends JFrame {

	private JPanel contentPane;
	private JTextField kullanici_adi_alani;
	
	CalisanIslemleri islemler = new CalisanIslemleri();
	private JPasswordField parola_alani;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GirisEkraný frame = new GirisEkraný();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GirisEkraný() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 288);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Kullan\u0131c\u0131 Ad\u0131 : ");
		
		JLabel lblNewLabel_1 = new JLabel("Parola : ");
		
		kullanici_adi_alani = new JTextField();
		kullanici_adi_alani.setColumns(10);
		
		JLabel mesaj_alani = new JLabel("");
		JButton giris = new JButton("G\u0130R\u0130\u015E YAP");
		
		giris.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				mesaj_alani.setText("");
				String kullanici_adi = kullanici_adi_alani.getText();
				String parola = new String(parola_alani.getPassword());
				
				boolean girisbasarili = islemler.girisYap(kullanici_adi, parola);
				
				if(girisbasarili == true)
				{
					   CalisanEkrani calisanEkrani = new CalisanEkrani(null, girisbasarili);
			           setVisible(false);
			           calisanEkrani.setVisible(true);
			           System.exit(0);
				}
				else
				{
			        JOptionPane.showMessageDialog(null, "Giriþ baþarýsýz!", "HATA", JOptionPane.ERROR_MESSAGE);
					//mesaj_alani.setText("Giriþ baþarýsýz, lütfen tekrar deneyin!");
				}
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("ADM\u0130N G\u0130R\u0130\u015E PANEL\u0130");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		parola_alani = new JPasswordField();
		
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(115)
					.addComponent(lblNewLabel_2)
					.addContainerGap(126, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(99, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(mesaj_alani, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(giris)
								.addComponent(kullanici_adi_alani, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
								.addComponent(parola_alani))
							.addGap(98))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel)
						.addComponent(kullanici_adi_alani, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(parola_alani, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addComponent(giris)
					.addGap(18)
					.addComponent(mesaj_alani, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(24))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
